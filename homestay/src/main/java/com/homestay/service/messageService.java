package com.homestay.service;

import com.homestay.mapper.messageMapper;
import com.homestay.pojo.message;
import com.homestay.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class messageService {
    private SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 查询所有留言情况
     * @return
     */
    public List<message> selectAllmessage(){
        //调用messageMapper.selectAllmessage()

        //2.获取Sqlsession
        SqlSession sqlSession = factory.openSession();
        //3.获取messageMapper
        messageMapper mapper = sqlSession.getMapper(messageMapper.class);
        //4.调用方法
        List<message> messages = mapper.selectAllmessage();

        sqlSession.close();

        return messages;


    }
}
