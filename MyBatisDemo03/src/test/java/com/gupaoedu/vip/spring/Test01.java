package com.gupaoedu.vip.spring;

import com.gupaoedu.vip.dao.IUserDao;
import com.gupaoedu.vip.domain.User;
import com.gupaoedu.vip.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(value = SpringJUnit4ClassRunner.class)
public class Test01 {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserDao userDao;

    @Test
    public void testQuery1(){
        List<User> users = userMapper.selectUserList();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testQuery2(){
        List<User> users = userDao.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
