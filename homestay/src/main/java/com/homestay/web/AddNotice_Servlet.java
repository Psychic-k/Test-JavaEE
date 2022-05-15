package com.homestay.web;

import com.homestay.pojo.notice;
import com.homestay.service.noticeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addNotice_Servlet")
public class AddNotice_Servlet extends HttpServlet {

    private noticeService service = new noticeService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理post请求乱码问题
        request.setCharacterEncoding("utf-8");

        //1.接受数据，封装为notice对象

        String title = request.getParameter("title");
        String time = request.getParameter("time");
        String noticetxt = request.getParameter("noticetxt");


        //封装为notice对象
        notice notice = new notice();
        notice.setTitle(title);
        notice.setTime(time);
        notice.setNoticetxt(noticetxt);

        //2.调用service完成添加公告
        service.add(notice);


        //3.转发到selectAll_NoticeServlet
//        request.getRequestDispatcher("/selectAll_NoticeServlet").forward(request,response);
        request.getRequestDispatcher("notice_boss.jsp").forward(request,response);
    }
}
