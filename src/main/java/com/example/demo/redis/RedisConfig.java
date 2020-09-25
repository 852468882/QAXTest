package com.example.demo.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@ConditionalOnClass(JedisClient.class)
@Slf4j
public class RedisConfig {

    @Value("${spring.redis.database:0}")
    private int database;       //Redis数据库索引(默认为0)
    @Value("${spring.redis.host}")
    private String host;        //Redis服务器地址
    @Value("${spring.redis.port}")
    private int port;           //Redis服务器连接端口
    @Value("${spring.redis.password}")
    private String password;    //Redis服务器连接密码（默认为空）
    @Value("${spring.redis.timeout}")
    private int timeOut;        //连接超时时间（毫秒）
    @Value("${spring.redis.jedis.pool.max-active:8}")
    private int maxActive;      //连接池最大连接数（使用负值表示没有限制）
    @Value("${spring.redis.jedis.pool.max-wait:-1}")
    private int maxWaitMillis;  //连接池最大阻塞等待时间（使用负值表示没有限制）
    @Value("${spring.redis.jedis.pool.max-idle:8}")
    private int maxIdle;        //连接池中的最大空闲连接
    @Value("${spring.redis.jedis.pool.min-idle:0}")
    private int minIdle;        //连接池中的最小空闲连接

    @Bean
    public JedisPool jedisPool(){
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(maxActive);
        config.setMaxWaitMillis(maxWaitMillis);
        config.setMaxIdle(maxIdle);
        config.setMinIdle(minIdle);
        JedisPool jedisPool = new JedisPool(config,host,port,timeOut,password,database);
        log.info("redis连接池创建成功");
        log.info("redis地址：{}:{}；数据库索引：{}",host,port,database);
        return jedisPool;
    }

}