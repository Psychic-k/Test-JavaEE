package com.homestay.mapper;

import com.homestay.pojo.client;
import com.homestay.pojo.house;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface houseMapper {
    /**
     * 查询民宿情况
     * @return
     */
    @Select("select * from tb_house")
//    @ResultMap("houseResultMap")
    List<house> selectAll();

    @Select("select * from tb_house where housestatue='空'")
    List<house> selectAllempty();

    @Update("update tb_house set housestatue='入住' where houseid=#{houseid} ")
    void updateHousestatue(String houseid);

    @Update("update tb_house set housestatue='空' where houseid=#{houseid} ")
    void updateHousestatue2(String houseid);

    @Insert("insert into tb_house values(#{houseid},#{housename},#{housetype},#{housestatue},#{houseprice})")
    void add(house house);
}
