package com.gupaoedu.example.springbootdemo;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class CustomerHealthIndicator extends AbstractHealthIndicator {
	@Override
	protected void doHealthCheck(Health.Builder builder)  {
		// 集成到 http://localhost:8080/actuator/health
		builder.up().withDetail("customerHealthIndicator", "test");
	}
}
