package com.homestay.web;

import com.homestay.service.clientService;
import com.homestay.service.houseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delectClient_Servlet")
public class delectClient_Servlet extends HttpServlet {
    private clientService service = new clientService();
    private houseService service2 = new houseService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理post请求乱码问题
        request.setCharacterEncoding("utf-8");
        //接受数据
        String houseid = request.getParameter("houseid");

        //删除该客房订单信息，并将客房状态修改为空
        service.delectByhouseid(houseid);
        service2.updateHousestatue2(houseid);

        //3.转发到selectAll_ClientServlet
        request.getRequestDispatcher("/selectAll_ClientServlet").forward(request,response);

    }
}
