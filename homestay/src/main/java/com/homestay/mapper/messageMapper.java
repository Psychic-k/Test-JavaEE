package com.homestay.mapper;


import com.homestay.pojo.message;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface messageMapper {
    /**
     * 查询留言情况
     * @return
     */

    @Select("select * from tb_message")
    List<message> selectAllmessage();

}
