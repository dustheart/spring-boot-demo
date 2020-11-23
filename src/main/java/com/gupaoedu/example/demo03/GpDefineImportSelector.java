package com.gupaoedu.example.demo03;

import com.gupaoedu.example.demo01.RedisConfiguration;
import com.gupaoedu.example.demo02.MybatisConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class GpDefineImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata annotationMetadata) {
		return new String[]{RedisConfiguration.class.getName(), MybatisConfiguration.class.getName()};
	}

}
