package com.gupaoedu.example.dao.mappers;

import com.gupaoedu.example.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	int insert(User user);
}
