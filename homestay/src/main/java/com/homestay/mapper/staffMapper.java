package com.homestay.mapper;

import com.homestay.pojo.staff;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface staffMapper {

    @Select("select * from tb_staff")
    List<staff> selectAllstaff();

    @Insert("insert into tb_staff values(#{id},#{duty},#{name},#{age},#{sex},#{tenure},#{salary})")
    void add(staff staff);
}
