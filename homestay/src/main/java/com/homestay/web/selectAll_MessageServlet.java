package com.homestay.web;


import com.homestay.pojo.message;
import com.homestay.service.messageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll_MessageServlet")
public class selectAll_MessageServlet extends HttpServlet {

    private messageService service = new messageService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用messageService完成查询
        List<message> messages = service.selectAllmessage();

        //2.存入request域中
        request.setAttribute("messages",messages);

        //3.转发到messageBoard.jsp
        request.getRequestDispatcher("/messageBoard.jsp").forward(request,response);
    }
}
