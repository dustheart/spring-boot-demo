package com.gupaoedu.example.springbootdemo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Endpoint(id="customer")
@Component
public class CustomerMetricsIndicator {

	@ReadOperation
	public Map<String,Object> time(){
		Map<String,Object> result = new HashMap<>();
		Date time = new Date();
		result.put("当前时间", time.toString());
		return result;
	}

}
