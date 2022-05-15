package com.homestay.service;


import com.homestay.mapper.repairMapper;
import com.homestay.pojo.repair;
import com.homestay.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.util.List;

public class repairService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 查询所有报修信息
     */
    public List<repair> selectAllrepair(){
        SqlSession sqlSession = factory.openSession();

        repairMapper mapper = sqlSession.getMapper(repairMapper.class);

        List<repair> repairs = mapper.selectAllrepair();

        sqlSession.close();

        return repairs;
    }
}
