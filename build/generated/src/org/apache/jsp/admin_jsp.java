package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.taxibooking.model.Customer;
import com.taxibooking.logic.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>DashBoard</title>\r\n");
      out.write(" <style>\r\n");
      out.write("        .top-container\r\n");
      out.write("        {\r\n");
      out.write("            display: grid;\r\n");
      out.write("            grid-template-columns: 90% 10%;\r\n");
      out.write("            background-color: #0D4C92;\r\n");
      out.write("        }\r\n");
      out.write("       \r\n");
      out.write("          .button {\r\n");
      out.write("            background-color: #4CAF50; /* Green */\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("            transition-duration: 0.4s;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            width: 80px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            margin-top: 22px;\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          .button1 {\r\n");
      out.write("            background-color: white; \r\n");
      out.write("            color: black; \r\n");
      out.write("            border: 2px solid #4CAF50;\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          .button1:hover {\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          .card {\r\n");
      out.write("            box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);\r\n");
      out.write("            transition: 0.2s;\r\n");
      out.write("            width: 90%;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          .card:hover {\r\n");
      out.write("            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          .container {\r\n");
      out.write("            padding: 2px 16px;\r\n");
      out.write("          }\r\n");
      out.write("          .grid{\r\n");
      out.write("            display: grid;\r\n");
      out.write("            grid-template-columns: auto auto auto;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            gap: 20px;\r\n");
      out.write("            \r\n");
      out.write("          }\r\n");
      out.write("          .btn\r\n");
      out.write("          {\r\n");
      out.write("          \tmargin-top:15px;\r\n");
      out.write("          \theight : 40px;\r\n");
      out.write("          \ttext-align:center;\r\n");
      out.write("          \ttransition-duration: 0.4s;\r\n");
      out.write("          \tbackground-color: white;\r\n");
      out.write("\t\t\tcursor:pointer;\r\n");
      out.write("            color: black; \r\n");
      out.write("            border: 2px solid #4CAF50;\r\n");
      out.write("          }\r\n");
      out.write("          .btn:hover {\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("          }\r\n");
      out.write("    </style>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
 
	// to prevent back button after logout ... we need block caching the memory in the browser.
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // suite for http 1.1
	response.setHeader("pragma","no-cache");  // for older versions HTTP 1.0
	response.setHeader("expires","0");  // for proxy users
	
	Customer cust = (Customer)session.getAttribute("cust"); 
	Object adminControl = session.getAttribute("admin-control");
	 
	
      out.write("\r\n");
      out.write("\t <div class=\"top-container\">\r\n");
      out.write("            <h1 style=\"margin-left:20px; color:white\">Welcome Admin!</h1>\r\n");
      out.write("            <form action=\"logout\">\r\n");
      out.write("            <button class=\"button button1\" type=\"submit\">Logout</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>        \r\n");
      out.write("        <p style=\"margin-left:20px;\">Last Accessed : ");
      out.print(cust.getLastAccessedTime());
      out.write("</p>\r\n");
      out.write("        <div class=\"grid\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img src=\"images/taxi.jpg\" alt=\"Avatar\" width=\"200px\" height=\"120px\" >\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                <form action=\"TaxiEarnings\">\r\n");
      out.write("                 <button class=\"btn\" type=\"submit\"> <h3><b>View Taxi Earnings</b></h3> </button>\r\n");
      out.write("                 </form>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("              <div class=\"card\">\r\n");
      out.write("                <img src=\"images/reset.JPG\" alt=\"Avatar\" width=\"200px\" height=\"120px\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                <form action=\"ResetData\">\r\n");
      out.write("                 <button class=\"btn\" type=\"submit\"><h3><b>Reset Taxi Position</b></h3></button>  \r\n");
      out.write("                 </form>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("              <div class=\"card\">\r\n");
      out.write("                <img src=\"images/add.jpg\" alt=\"Avatar\" width=\"200px\" height=\"120px\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                   <form action=\"AddNewTaxi\" method=\"get\">\r\n");
      out.write("                 <button class=\"btn\" type=\"submit\"><h3><b>Add New Taxi</b></h3></button>\r\n");
      out.write("                 </form> \r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"card\">\r\n");
      out.write("                <img src=\"images/map.jpg\" alt=\"Avatar\" width=\"200px\" height=\"120px\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                   <form action=\"ViewTaxiLocation\">\r\n");
      out.write("                 <button class=\"btn\" type=\"submit\"><h3><b>View Taxi Location</b></h3></button>\r\n");
      out.write("                 </form> \r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"card\">\r\n");
      out.write("                <img src=\"images/hist.jpg\" alt=\"Avatar\" width=\"200px\" height=\"120px\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                  <form action=\"history\">\r\n");
      out.write("                 <button class=\"btn\" type=\"submit\"><h3><b>View Booked History</b></h3></button>\r\n");
      out.write("                 </form>  \r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
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
