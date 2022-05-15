package com.homestay.web;

import com.homestay.pojo.house;
import com.homestay.pojo.staff;
import com.homestay.service.houseService;
import com.homestay.service.staffService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addHouse_Servlet")
public class AddHouse_Servlet extends HttpServlet {

    private houseService service = new houseService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理post请求乱码问题
        request.setCharacterEncoding("utf-8");

        //1.接受数据，封装为staff对象
        String houseid = request.getParameter("houseid");
        String housename = request.getParameter("housename");
        String housetype = request.getParameter("housetype");
        String housestatue = request.getParameter("housestatue");
        String houseprice = request.getParameter("houseprice");


        //封装为staff对象
        house house = new house();
        house.setHouseid(houseid);
        house.setHousename(housename);
        house.setHousetype(housetype);
        house.setHousestatue(housestatue);
        house.setHouseprice(houseprice);


        //2.调用service完成添加并修改住房状态
        service.add(house);

        //3.转发到selectAll_StaffServlet
        request.getRequestDispatcher("/selectAll_HouseServlet").forward(request,response);

    }
}
