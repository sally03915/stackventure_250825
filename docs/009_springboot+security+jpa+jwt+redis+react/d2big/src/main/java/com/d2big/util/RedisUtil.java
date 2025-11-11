package com.d2big.util;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
@RequiredArgsConstructor
public class RedisUtil {

    private final StringRedisTemplate redisTemplate;

    public void saveRefreshToken(String username, String token, long expirationMillis) {
        redisTemplate.opsForValue().set("RT:" + username, token, Duration.ofMillis(expirationMillis));
    }

    public String getRefreshToken(String username) {
        return redisTemplate.opsForValue().get("RT:" + username);
    }

    public void deleteRefreshToken(String username) {
        redisTemplate.delete("RT:" + username);
    }
}
