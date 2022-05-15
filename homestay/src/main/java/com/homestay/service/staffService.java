package com.homestay.service;


import com.homestay.mapper.staffMapper;
import com.homestay.pojo.staff;
import com.homestay.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class staffService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<staff> selectAllstaff(){

        SqlSession sqlSession = factory.openSession();

        staffMapper mapper = sqlSession.getMapper(staffMapper.class);

        List<staff> staffs = mapper.selectAllstaff();

        sqlSession.close();

        return staffs;

    }

    public void add(staff staff){
        SqlSession sqlSession = factory.openSession();

        staffMapper mapper = sqlSession.getMapper(staffMapper.class);

        mapper.add(staff);

        //提交事务
        sqlSession.commit();

        sqlSession.close();

    }

}
