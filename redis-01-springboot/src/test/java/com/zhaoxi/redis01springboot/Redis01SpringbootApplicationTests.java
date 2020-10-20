package com.zhaoxi.redis01springboot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhaoxi.redis01springboot.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Redis01SpringbootApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() throws JsonProcessingException {
        //
//		redisTemplate.opsForValue()
//		redisTemplate.opsForList()
//		redisTemplate.opsForSet()
//		redisTemplate.opsForHash()
//        redisTemplate.opsForZSet()
//		redisTemplate.opsForHyperLogLog()
//		redisTemplate.opsForGeo()
//		redisTemplate.opsForCluster()
//		RedisConnectionFactory connectionFactory = redisTemplate.getRequiredConnectionFactory();
//		RedisConnectionFactory connectionFactory = redisTemplate.getConnectionFactory();
//		connectionFactory.getConnection().flushAll();
//		connectionFactory.getConnection().flushDb();
//		redisTemplate.opsForValue().set("chenyinjie", "老夫天下无敌");
//        System.out.println(redisTemplate.opsForValue().get("chenyinjie"));

        User user =new User("12","123");
        ObjectMapper objectMapper =new ObjectMapper();
        String s = objectMapper.writeValueAsString(user);
        redisTemplate.opsForValue().set("chenyj",user);
        System.out.println(redisTemplate.opsForValue().get("chenyj"));
    }

}
