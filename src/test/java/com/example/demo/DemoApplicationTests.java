package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;

@SpringBootTest
class DemoApplicationTests {

	/*@Autowired
	private StringRedisTemplate redisTemplate;
	@Test
	void contextLoads() {
		String aaa = redisTemplate.opsForValue().get("aaa");
		if (StringUtils.isEmpty(aaa)) {
			redisTemplate.opsForValue().set("aaa", "123");
		}
		System.out.println(aaa);
	}*/

}
