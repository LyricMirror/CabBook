package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.taxibooking.model.*;
import com.taxibooking.dao.TaxiDatabaseUtil;
import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.*;

public final class bookedHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Taxi Earnings</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t\t .top-container{\r\n");
      out.write("            display: grid;\r\n");
      out.write("            grid-template-columns: 90% 10%;\r\n");
      out.write("            background-color: #0D4C92;\r\n");
      out.write("        }\r\n");
      out.write("        #data {\r\n");
      out.write("  \t\t\tfont-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("  \t\t\tborder-collapse: collapse;\r\n");
      out.write("  \t\t\twidth: 100%;\r\n");
      out.write("  \t\t\ttext-align:center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#data td, #data th {\r\n");
      out.write("  \t\t\tborder: 1px solid #ddd;\r\n");
      out.write("  \t\t\tpadding: 8px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t#data tr:nth-child(even){background-color: #f2f2f2;}\r\n");
      out.write("\r\n");
      out.write("\t\t#data tr:hover {background-color: #ddd;}\r\n");
      out.write("\r\n");
      out.write("\t\t#data th {\r\n");
      out.write("  \t\t\tpadding-top: 12px;\r\n");
      out.write("  \t\t\tpadding-bottom: 12px;\r\n");
      out.write("  \t\t\tbackground-color: #04AA6D;\r\n");
      out.write("  \t\t\tcolor: white;\r\n");
      out.write("\t\t}\r\n");
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
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
 
	// to prevent back button after logout ... we need block caching the memory in the browser.
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // suite for http 1.1
	response.setHeader("pragma","no-cache");  // for older versions HTTP 1.0
	response.setHeader("expires","0");  // for proxy users
	
	Customer cust = (Customer)session.getAttribute("cust"); 
	Object adminControl = session.getAttribute("admin-control");
	if(cust==null || adminControl==null)
	{
		response.sendRedirect("home.jsp");
		return;
	} 
	
      out.write("\r\n");
      out.write("\t <div class=\"top-container\">\r\n");
      out.write("            <h1 style=\"margin-left:20px; color:white\">Customer Booked History</h1>\r\n");
      out.write("            <button class=\"button button1\" onclick=\"window.location.href='admin.jsp'\">Back</button>\r\n");
      out.write("       </div>\r\n");
      out.write("       \r\n");
      out.write("       ");
 List<History> details = (List<History>) session.getAttribute("taxi-his"); 
       
       
      out.write("\r\n");
      out.write("       <h3>Total Number Of Records : ");
      out.print(details.size() );
      out.write("</h3>\r\n");
      out.write("       <table id=\"data\">\r\n");
      out.write("       <tr>\r\n");
      out.write("       <th>Date</th>\r\n");
      out.write("       \t<th>Taxi</th>\r\n");
      out.write("       \t<th>Customer Name</th>\r\n");
      out.write("       \t<th>From</th>\r\n");
      out.write("       \t<th>To</th>\r\n");
      out.write("       \t<th>Pickup Time</th>\r\n");
      out.write("       \t<th>Drop Time</th>\r\n");
      out.write("       \t<th>Amount</th>\r\n");
      out.write("       </tr>\r\n");
      out.write("       ");
 for(History hist : details){ 
      out.write("\r\n");
      out.write("       <tr>\r\n");
      out.write("       <td>");
      out.print(hist.getDate() );
      out.write("</td>\r\n");
      out.write("       <td>TAXI ");
      out.print(hist.getTaxi_id() );
      out.write("</td>\r\n");
      out.write("       <td> ");
      out.print(hist.getcustName() );
      out.write("</td>\r\n");
      out.write("       <td> ");
      out.print(hist.getFromLocation() );
      out.write("</td>\r\n");
      out.write("       <td> ");
      out.print(hist.getToLocation() );
      out.write("</td>\r\n");
      out.write("       <td> ");
 int ptime = hist.getPickUpTime(); 
       			if(ptime<12)out.print(ptime+" AM");
       			else if (ptime==12)out.print(ptime+" PM");
       			else out.print(ptime-12+" PM"); 
      out.write(" </td>\r\n");
      out.write("       <td> ");
int time = hist.getDropTime(); 
			if(time<12) out.print(time+" AM");
			else if(time==12)out.print(time+" PM");
			else out.print(time-12+" PM"); 
      out.write("</td>\r\n");
      out.write("       <td> Rs. ");
      out.print(hist.getAmount() );
      out.write("</td>\r\n");
      out.write("       </tr>\r\n");
      out.write("       ");
 } 
      out.write("\r\n");
      out.write("       \r\n");
      out.write("       </table>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("       \r\n");
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
