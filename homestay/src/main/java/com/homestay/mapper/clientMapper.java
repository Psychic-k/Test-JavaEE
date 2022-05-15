package com.homestay.mapper;

import com.homestay.pojo.client;
import com.homestay.pojo.house;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface clientMapper {
    /**
     * 查询所有客户信息（即当前的订单信息）
     * @return
     */

    @Select("select * from tb_client")
    List<client> selectAllclient();


    @Insert("insert into tb_client values(#{clientid},#{clientname},#{sex},#{tell},#{idcard},#{houseid},#{checkin},#{checkout})")
    void add(client client);



    @Delete("delete from tb_client where houseid=#{houseid}")
    void delectByhouseid(String houseid);

}
