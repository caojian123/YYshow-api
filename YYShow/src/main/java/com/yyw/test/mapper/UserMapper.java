package com.yyw.test.mapper;

import com.yyw.test.domain.User;

public interface UserMapper {
public User getUserById(Integer userId) throws Exception;
	
	public User login(User user) throws Exception;
	
	public Integer updateUser(User user) throws Exception;
}
