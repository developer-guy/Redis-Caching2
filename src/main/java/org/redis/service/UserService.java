package org.redis.service;

import org.redis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by bapaydin on 10.11.2016.
 */
@Service
public class UserService {
    @Autowired
    RedisTemplate<String, User> redisTemplate;

    public User saveUser(User user){
        redisTemplate.opsForHash().put("user",user.getId(),user);
        return user;
    }
}
