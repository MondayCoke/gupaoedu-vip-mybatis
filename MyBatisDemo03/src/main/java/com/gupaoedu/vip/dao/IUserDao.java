package com.gupaoedu.vip.dao;

import com.gupaoedu.vip.domain.User;
import com.gupaoedu.vip.mapper.UserMapper;

import java.util.List;

public interface IUserDao {

    List<User> selectAll();
}
