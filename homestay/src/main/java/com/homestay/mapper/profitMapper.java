package com.homestay.mapper;

import com.homestay.pojo.profit;
import com.homestay.pojo.staff;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface profitMapper {

    @Select("select * from tb_profit")
    List<profit> selectAllprofit();

}
