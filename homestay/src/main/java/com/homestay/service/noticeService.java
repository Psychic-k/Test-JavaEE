package com.homestay.service;

import com.homestay.mapper.clientMapper;
import com.homestay.mapper.noticeMapper;
import com.homestay.pojo.client;
import com.homestay.pojo.notice;
import com.homestay.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class noticeService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<notice> selectAllnotice(){

        SqlSession sqlSession = factory.openSession();

        noticeMapper mapper = sqlSession.getMapper(noticeMapper.class);

        List<notice> notices = mapper.selectAllnotice();

        sqlSession.close();

        return notices;

    }

    /**
     * 添加客户信息，同时同步到订单查询界面
     * @param notice
     */
    public void add(notice notice){
        SqlSession sqlSession = factory.openSession();

        noticeMapper mapper = sqlSession.getMapper(noticeMapper.class);

        mapper.add(notice);

        //提交事务
        sqlSession.commit();

        sqlSession.close();

    }


}
