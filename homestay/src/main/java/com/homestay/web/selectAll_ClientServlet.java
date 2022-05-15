package com.homestay.web;


import com.homestay.pojo.client;
import com.homestay.service.clientService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll_ClientServlet")
public class selectAll_ClientServlet extends HttpServlet {

    private clientService service = new clientService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<client> clients = service.selectAllclient();

        request.setAttribute("clients",clients);

        request.getRequestDispatcher("/orderInquire.jsp").forward(request,response);


    }
}
