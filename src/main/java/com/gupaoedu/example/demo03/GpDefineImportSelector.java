package com.gupaoedu.example.demo03;

import com.gupaoedu.example.demo01.GpRedisTemplate;
import com.gupaoedu.example.demo02.MybatisConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class GpDefineImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata annotationMetadata) {
		// 动态导入bean，告诉了spring，两个配置类在哪里
		// 可以是配置类，也可以是bean

		// TODO 在这里去加载所有的配置类就行
		// TODO 通过某种机制去完成指定路径的配置类的扫描就行
		return new String[]{GpRedisTemplate.class.getName(), MybatisConfiguration.class.getName()};
	}

}