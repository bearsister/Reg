package org.lanqiao.dao;

import org.lanqiao.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    User insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User checkUser(User user);

	User registUser(User user);
}