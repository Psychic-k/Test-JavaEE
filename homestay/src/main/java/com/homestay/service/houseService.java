package com.homestay.service;

import com.homestay.mapper.clientMapper;
import com.homestay.mapper.houseMapper;
import com.homestay.pojo.client;
import com.homestay.pojo.house;
import com.homestay.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class houseService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();


    /**
     * 查询所有的民宿信息
     * @return
     */
    public List<house> selectAll(){
        //调用houseMapper.selectAll()

        //2.获取Sqlsession
        SqlSession sqlSession = factory.openSession();
        //3.获取houseMapper
        houseMapper mapper = sqlSession.getMapper(houseMapper.class);
        //4.调用方法
        List<house> houses = mapper.selectAll();

        sqlSession.close();

        return houses;

    }

    public List<house> selectAllempty(){
        //调用houseMapper.selectAll()

        //2.获取Sqlsession
        SqlSession sqlSession = factory.openSession();
        //3.获取houseMapper
        houseMapper mapper = sqlSession.getMapper(houseMapper.class);
        //4.调用方法
        List<house> houses = mapper.selectAllempty();

        sqlSession.close();

        return houses;

    }

    /**
     *入住时，将空的客房状态修改为入住
     * @param houseid
     */
    public void updateHousestatue(String houseid){
        //2.获取Sqlsession
        SqlSession sqlSession = factory.openSession();
        //3.获取houseMapper
        houseMapper mapper = sqlSession.getMapper(houseMapper.class);
        //调用方法
        mapper.updateHousestatue(houseid);
        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    /**
     * 退房时，将入住的客房状态修改为空
     * @param houseid
     */
    public void updateHousestatue2(String houseid){
        //2.获取Sqlsession
        SqlSession sqlSession = factory.openSession();
        //3.获取houseMapper
        houseMapper mapper = sqlSession.getMapper(houseMapper.class);
        //调用方法
        mapper.updateHousestatue2(houseid);
        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }

    public void add(house house){
        SqlSession sqlSession = factory.openSession();

        houseMapper mapper = sqlSession.getMapper(houseMapper.class);

        mapper.add(house);

        //提交事务
        sqlSession.commit();

        sqlSession.close();

    }
}
