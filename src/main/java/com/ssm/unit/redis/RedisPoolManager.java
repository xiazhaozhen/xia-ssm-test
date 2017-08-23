package com.ssm.unit.redis;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisPoolManager {
    private static Logger logger = LoggerFactory.getLogger(RedisPoolManager.class);

    @Qualifier("redisTemplate")
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


    private Boolean expire(String key, final long timeout, final TimeUnit unit) {
        return stringRedisTemplate.expire(key, timeout, unit);
    }

    private void put(String key, Object hashKey, Object value) {
        stringRedisTemplate.opsForHash().put(key, hashKey, value);
    }

    private Object get(String key, Object hashKey) {
        return stringRedisTemplate.opsForHash().get(key, hashKey);
    }


    public void setCacheWithSec(String key, String value, long expire) {
        put(key, key, value);
        expire(key, expire, TimeUnit.SECONDS);
    }

    public String getCache(String key) {
        return (String) get(key, key);
    }
}