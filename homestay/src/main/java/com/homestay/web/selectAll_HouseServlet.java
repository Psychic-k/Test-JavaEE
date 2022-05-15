package com.homestay.web;

import com.homestay.pojo.house;
import com.homestay.service.houseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll_HouseServlet")
public class selectAll_HouseServlet extends HttpServlet {

    private  houseService service = new houseService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.调用houseService完成查询
        List<house> houses = service.selectAll();

        //2.存入request域中
        request.setAttribute("houses",houses);

        //3.转发到houseStatue.jsp
        request.getRequestDispatcher("/houseStatue.jsp").forward(request,response);
    }
}
