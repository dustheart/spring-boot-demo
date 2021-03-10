package com.gupaoedu.example.springbootdemo;

public class SystemInfo implements SystemInfoMBean {

	@Override
	public int getCpuCore() {
		return Runtime.getRuntime().availableProcessors();
	}

	@Override
	public long getTotalMemory() {
		return Runtime.getRuntime().totalMemory();
	}

	@Override
	public void shutdown() {
		System.exit(0);
	}
}
