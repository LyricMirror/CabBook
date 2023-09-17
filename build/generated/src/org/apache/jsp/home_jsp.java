package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Cab Booking</title>\r\n");
      out.write("<style>\r\n");
      out.write("      .top-container\r\n");
      out.write("      {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        background-color: #0D4C92;\r\n");
      out.write("        color: white;\r\n");
      out.write("        padding:2px;\r\n");
      out.write("        display: flex;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("      }\r\n");
      out.write("      button\r\n");
      out.write("      {\r\n");
      out.write("        width: 120px;\r\n");
      out.write("        height: 30px;\r\n");
      out.write("        color: white;\r\n");
      out.write("        border: 2px solid #4CAF50;\r\n");
      out.write("        font-size: 15px;\r\n");
      out.write("        background-color: #4CAF50; /* Green */\r\n");
      out.write("        transition-duration: 0.4s;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("      }\r\n");
      out.write("      button:hover {\r\n");
      out.write("        background-color: white;\r\n");
      out.write("        color: black;\r\n");
      out.write("      }\r\n");
      out.write("      .login\r\n");
      out.write("      {\r\n");
      out.write("        background-image: url(\"https://i.pinimg.com/736x/f6/f3/85/f6f3854d01c7e2871a3328d2fecd9d44.jpg\");\r\n");
      out.write("        background-size: cover;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height:550px;\r\n");
      out.write("      }\r\n");
      out.write("      .container {\r\n");
      out.write("        margin-right: 20%;\r\n");
      out.write("        margin-left: 35%;\r\n");
      out.write("        margin-top: 2%;\r\n");
      out.write("        padding: 10px;  \r\n");
      out.write("        width:30%;\r\n");
      out.write("        height: 30%;\r\n");
      out.write("        border-style: groove;\r\n");
      out.write("        background: rgba(255, 255, 255, 0.4);\r\n");
      out.write("       border-radius: 20px;\r\n");
      out.write("      }    \r\n");
      out.write("      input[type=text],input[type=password]\r\n");
      out.write("      {\r\n");
      out.write("        display: inline-block;\r\n");
      out.write("        border: 2px solid #ccc;\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        width: 190px;\r\n");
      out.write("        height: 30px;\r\n");
      out.write("      }\r\n");
      out.write("      .container-2\r\n");
      out.write("      {\r\n");
      out.write("        font-weight: bolder; \r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t  <div class=\"top-container\">\r\n");
      out.write("      <h1 style=\"margin-left: 20px;\">Cab Booking</h1>\r\n");
      out.write("     \r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"login\">\r\n");
      out.write("    <h2 style=\"text-align: center;\">Customer Login Form</h2>\r\n");
      out.write("    <div class=\"container-2\">\r\n");
      out.write("      <h3>Note ! </h3>\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li> Available from 6AM to 12PM</li>\r\n");
      out.write("        <li> Runs from Borivali to Thakur College and Thakur College to Borivali.</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <form action=\"Login\" method=\"post\">\r\n");
      out.write("        <label for=\"uname\">Username : </label>\r\n");
      out.write("        <input type=\"text\" name=\"uname\" id=\"uname\" required>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <label for=\"pwd\">Password : </label>\r\n");
      out.write("        <input type=\"password\" name=\"psw\" id=\"psw\" required>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <button type=\"submit\">Login</button>\r\n");
      out.write("        <button onclick=\"window.location.href='Register'\">New Customer</button>\r\n");
      out.write("      </form>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>       \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
