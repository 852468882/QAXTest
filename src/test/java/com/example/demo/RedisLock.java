package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisLock {



    @Test
    public void tJedisPool(){
    }

    @Test
    public void tRedisConfig(){
    }

    /**
     * 加锁
     * 1.命令是互斥的 setNX
     * 2.设置的key要有过期时间 expired
     * 3.只能解自己的锁 key要有唯一value对应
     */
}
