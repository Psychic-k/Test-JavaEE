package com.homestay.web;

import com.homestay.pojo.client;
import com.homestay.service.clientService;
import com.homestay.service.houseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addClient_Servlet")
public class AddClient_Servlet extends HttpServlet {

    private clientService service = new clientService();
    private houseService service2 = new houseService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理post请求乱码问题
        request.setCharacterEncoding("utf-8");

        //1.接受数据，封装为client对象
//        String clientid = request.getParameter("clientid");
        String clientname = request.getParameter("clientname");
        String sex = request.getParameter("sex");
        String tell = request.getParameter("tell");
        String idcard = request.getParameter("idcard");
        String houseid = request.getParameter("houseid");
        String checkin = request.getParameter("checkin");
        String checkout = request.getParameter("checkout");

        //封装为client对象
        client client = new client();
//        client.setClientid(clientid);
        client.setClientname(clientname);
        client.setSex(sex);
        client.setTell(tell);
        client.setIdcard(idcard);
        client.setHouseid(houseid);
        client.setCheckin(checkin);
        client.setCheckout(checkout);

        //2.调用service完成添加并修改住房状态
        service.add(client);
        service2.updateHousestatue(houseid);

        //3.转发到selectAll_ClientServlet
        request.getRequestDispatcher("/selectAll_ClientServlet").forward(request,response);

    }
}
