package com.homestay.service;

import com.homestay.mapper.clientMapper;
import com.homestay.pojo.client;
import com.homestay.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class clientService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<client> selectAllclient(){

        SqlSession sqlSession = factory.openSession();

        clientMapper mapper = sqlSession.getMapper(clientMapper.class);

        List<client> clients = mapper.selectAllclient();

        sqlSession.close();

        return clients;

    }

    /**
     * 添加客户信息，同时同步到订单查询界面
     * @param client
     */
    public void add(client client){
        SqlSession sqlSession = factory.openSession();

        clientMapper mapper = sqlSession.getMapper(clientMapper.class);

        mapper.add(client);

        //提交事务
        sqlSession.commit();

        sqlSession.close();

    }

    public void delectByhouseid(String houseid){
        SqlSession sqlSession = factory.openSession();

        clientMapper mapper = sqlSession.getMapper(clientMapper.class);

        mapper.delectByhouseid(houseid);

        sqlSession.commit();

        sqlSession.close();

    }
}
