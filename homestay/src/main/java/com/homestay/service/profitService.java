package com.homestay.service;


import com.homestay.mapper.profitMapper;
import com.homestay.mapper.staffMapper;
import com.homestay.pojo.profit;
import com.homestay.pojo.staff;
import com.homestay.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class profitService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<profit> selectAllprofit(){

        SqlSession sqlSession = factory.openSession();

        profitMapper mapper = sqlSession.getMapper(profitMapper.class);

        List<profit> profits = mapper.selectAllprofit();

        sqlSession.close();

        return profits;

    }

}
