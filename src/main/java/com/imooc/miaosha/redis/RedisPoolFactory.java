package com.imooc.miaosha.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Service
public class RedisPoolFactory
{


    @Bean
    public JedisPool JedisPoolFactory()
    {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(500);
        poolConfig.setMaxTotal(1000);
        poolConfig.setMaxWaitMillis(500 * 1000);
        JedisPool jp = new JedisPool(poolConfig, "188.166.175.32", 6379,
                10 * 1000);
        return jp;
    }

}
