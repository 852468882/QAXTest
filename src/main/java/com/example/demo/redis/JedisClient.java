package com.example.demo.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.params.SetParams;

import java.util.Collections;

@Component
@Slf4j
public class JedisClient {

    @Autowired
    JedisPool jedisPool;

    // ================================String================================
    public void set(String key, String value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
        } finally {
            jedis.close();
        }
    }

    // =================================Hash=================================

    //各种操作......


    /**
     * 加锁
     *
     * @param lock      锁的key
     * @param requestId 对应客户端的标志
     * @param timeout   锁的过期时间
     * @return true-加锁成功，false-加锁失败
     */

    public boolean lock(String lock, String requestId, Long timeout) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            SetParams setParams = SetParams.setParams().nx().px(timeout);
            String result = jedis.set(lock, requestId, setParams);
            return "OK".equalsIgnoreCase(result);
        } finally {
            jedis.close();
        }
    }


    /**
     * 解锁
     *
     * @param lock      锁的key
     * @param requestId 对应客户端的标志
     * @return true-解锁成功，false-解锁失败
     */

    public boolean unlock(String lock, String requestId) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();

            /*这段Lua代码的功能是 首先获取锁对应的value值，检查是否与requestId相等，如果相等则删除锁（解锁）
             * 在eval命令执行Lua代码的时候，Lua代码将被当成一个命令去执行，保证原子性，并且直到eval命令执行完成，Redis才会执行其他命令。*/

            String luaScript = "if redis.call('get',KEYS[1]) == ARGV[1] then" +
                    "        return redis.call('del',KEYS[1])" +
                    "    else" +
                    "        return 0" +
                    "    end";
            Object result = jedis.eval(luaScript, Collections.singletonList(lock), Collections.singletonList(requestId));
            return result.equals(1L);
        } finally {
            jedis.close();
        }
    }
}
