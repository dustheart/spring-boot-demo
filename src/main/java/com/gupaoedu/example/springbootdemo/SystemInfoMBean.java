package com.gupaoedu.example.springbootdemo;

public interface SystemInfoMBean {

	int getCpuCore();

	long getTotalMemory();

	void shutdown();

}
