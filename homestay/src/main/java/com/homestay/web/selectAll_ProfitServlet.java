package com.homestay.web;


import com.homestay.pojo.client;
import com.homestay.pojo.profit;
import com.homestay.service.clientService;
import com.homestay.service.profitService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll_ProfitServlet")
public class selectAll_ProfitServlet extends HttpServlet {

    private profitService service = new profitService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<profit> profits = service.selectAllprofit();

        request.setAttribute("profits",profits);

        request.getRequestDispatcher("/profit.jsp").forward(request,response);


    }
}
