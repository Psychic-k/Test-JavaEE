package com.homestay.web;

import com.homestay.pojo.repair;
import com.homestay.service.repairService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll_RepairServlet")
public class selectAll_RepairServlet extends HttpServlet {
    private repairService service = new repairService();


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<repair> repairs = service.selectAllrepair();

        request.setAttribute("repairs",repairs);

        request.getRequestDispatcher("/repairStatue.jsp").forward(request,response);
    }
}
