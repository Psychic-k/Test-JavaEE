package com.homestay.mapper;

import com.homestay.pojo.client;
import com.homestay.pojo.notice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface noticeMapper {
    /**
     *
     * @return
     */

    @Select("select * from tb_notice")
    List<notice> selectAllnotice();


    @Insert("insert into tb_notice values(#{title},#{time},#{noticetxt})")
    void add(notice notice);



}
