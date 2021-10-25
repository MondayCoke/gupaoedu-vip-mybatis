package com.gupaoedu.vip.dao.impl;

import com.gupaoedu.vip.dao.IUserDao;
import com.gupaoedu.vip.domain.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<User> selectAll() {
        return getSqlSession().selectList("com.gupaoedu.vip.mapper.UserMapper.selectUserList");
    }
}
