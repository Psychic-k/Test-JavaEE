package com.homestay.web;


import com.homestay.pojo.staff;
import com.homestay.service.staffService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll_StaffServlet")
public class selectAll_StaffServlet extends HttpServlet {

    private staffService service = new staffService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<staff> staffs = service.selectAllstaff();

        request.setAttribute("staffs",staffs);

        request.getRequestDispatcher("/staff.jsp").forward(request,response);


    }
}
