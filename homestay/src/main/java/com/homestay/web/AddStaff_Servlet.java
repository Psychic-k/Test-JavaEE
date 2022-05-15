package com.homestay.web;

import com.homestay.pojo.client;
import com.homestay.pojo.staff;
import com.homestay.service.clientService;
import com.homestay.service.houseService;
import com.homestay.service.staffService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addStaff_Servlet")
public class AddStaff_Servlet extends HttpServlet {

    private staffService service = new staffService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理post请求乱码问题
        request.setCharacterEncoding("utf-8");

        //1.接受数据，封装为staff对象
        String duty = request.getParameter("duty");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String tenure = request.getParameter("tenure");
        String salary = request.getParameter("salary");


        //封装为staff对象
        staff staff = new staff();
        staff.setDuty(duty);
        staff.setName(name);
        staff.setAge(age);
        staff.setSex(sex);
        staff.setTenure(tenure);
        staff.setSalary(salary);

        //2.调用service完成添加并修改住房状态
        service.add(staff);

        //3.转发到selectAll_StaffServlet
        request.getRequestDispatcher("/selectAll_StaffServlet").forward(request,response);

    }
}
