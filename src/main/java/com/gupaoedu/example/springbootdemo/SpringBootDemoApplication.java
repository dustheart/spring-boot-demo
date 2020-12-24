package com.gupaoedu.example.springbootdemo;

import com.gupaoedu.autoconfiguration.GupaoEduCore;
import com.gupaoedu.example.demo01.GpRedisTemplate;
import com.gupaoedu.example.demo02.GpSqlSessionFactory;
import com.gupaoedu.example.demo03.EnableConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableConfiguration
@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ca = SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println(ca.getBean(GpRedisTemplate.class));
		System.out.println(ca.getBean(GpSqlSessionFactory.class));
		System.out.println(ca.getBean(GupaoEduCore.class));
	}

}
