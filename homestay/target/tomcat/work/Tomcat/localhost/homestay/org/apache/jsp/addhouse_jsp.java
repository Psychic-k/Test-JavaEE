/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-12-27 05:24:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addhouse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>窝趣公寓门店管理系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/airbnb.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"starclear();username()\">\r\n");
      out.write("<div id=\"logo\">\r\n");
      out.write("    <img src=\"./imgs/logo_white.png\" id=\"logo1\" alt=\"\">\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!--主界面左侧菜单-->\r\n");
      out.write("<div id=\"Menue\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"index_boss.jsp\" id=\"home\"><b>首页</b></a></li>\r\n");
      out.write("        <li><a href=\"/homestay/selectAll_StaffServlet\" ><b>员工管理</b></a></li>\r\n");
      out.write("        <li><a href=\"/homestay/checkAll_HouseServlet\" ><b>客房管理</b></a></li>\r\n");
      out.write("        <li><a href=\"/homestay/selectAll_ProfitServlet\" ><b>年度报表</b></a></li>\r\n");
      out.write("        <li><a href=\"notice_boss.jsp\" ><b>公告管理</b></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"Topline\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div id=\"headImg\"><img src=\"imgs/boss.png\" id=\"txt\" alt=\"\"></div>\r\n");
      out.write("    <p id=\"time\"></p>\r\n");
      out.write("    <h2>BOSS&nbsp;&nbsp;</h2>\r\n");
      out.write("    <button type=\"button\" id=\"quit\" onclick=\"quit()\">退出</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"MainArea\">\r\n");
      out.write("    <div id=\"Main_Area2\">\r\n");
      out.write("        <div class=\"mb\">\r\n");
      out.write("            <h1>新增客房</h1>\r\n");
      out.write("            <form name=\"form1\" method=\"post\" action=\"/homestay/addHouse_Servlet\" autocomplete=\"off\" onsubmit=show()>\r\n");
      out.write("\r\n");
      out.write("                <br />\r\n");
      out.write("                <label>客房编号：\r\n");
      out.write("                    <input type=\"text\" name=\"houseid\" required />\r\n");
      out.write("                </label>\r\n");
      out.write("                <br />\r\n");
      out.write("                <label>客房名称：\r\n");
      out.write("                    <input type=\"text\" name=\"housename\" required />\r\n");
      out.write("                </label>\r\n");
      out.write("                <br />\r\n");
      out.write("                <label>客房类型：\r\n");
      out.write("                    <input type=\"text\" name=\"housetype\" required />\r\n");
      out.write("                </label>\r\n");
      out.write("                <br />\r\n");
      out.write("                <label>客房状态：\r\n");
      out.write("                    <input type=\"text\" name=\"housestatue\" required />\r\n");
      out.write("                </label>\r\n");
      out.write("                <br />\r\n");
      out.write("                <label>客房价格：\r\n");
      out.write("                    <input type=\"text\" name=\"houseprice\" required />\r\n");
      out.write("                </label>\r\n");
      out.write("                <br />\r\n");
      out.write("                <br/>\r\n");
      out.write("                <br/>\r\n");
      out.write("                <input type=\"submit\" class=\"checkbutton\"  value=\"提交新增\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
