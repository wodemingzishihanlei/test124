package com.example.springbootmybatis01;

import com.example.springbootmybatis01.mapper.TypeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatis01ApplicationTests {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Test
    public void contextLoads() {
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println(name);
    }
}
