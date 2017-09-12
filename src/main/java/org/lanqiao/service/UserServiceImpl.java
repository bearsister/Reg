package org.lanqiao.service;

import org.lanqiao.dao.UserMapper;
import org.lanqiao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	static
	UserMapper userMapper;
	@Override
	public User checkUser(User user) {
		return userMapper.checkUser(user);
	}

	public User insertUser(User user) {
		return userMapper.insert(user);
	}

}
