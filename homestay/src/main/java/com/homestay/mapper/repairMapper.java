package com.homestay.mapper;

import com.homestay.pojo.repair;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface repairMapper {

    /**
     * 查询报修信息
     */
    @Select("select * from tb_repair")
    List<repair> selectAllrepair();
}
