package com.homestay.web;


import com.homestay.pojo.notice;
import com.homestay.pojo.staff;
import com.homestay.service.noticeService;
import com.homestay.service.staffService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAll_NoticeServlet")
public class selectAll_NoticeServlet extends HttpServlet {

    private noticeService service = new noticeService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<notice> notices = service.selectAllnotice();

        request.setAttribute("notices",notices);

        request.getRequestDispatcher("/notice.jsp").forward(request,response);


    }
}
