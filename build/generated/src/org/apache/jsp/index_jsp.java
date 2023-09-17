package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.taxibooking.model.*;
import com.taxibooking.logic.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Welcome</title>\r\n");
      out.write(" <style>\r\n");
      out.write("        .top-container\r\n");
      out.write("        {\r\n");
      out.write("            display: grid;\r\n");
      out.write("            grid-template-columns: 90% 10%;\r\n");
      out.write("            background-color: #0D4C92;\r\n");
      out.write("        }\r\n");
      out.write("        .A1{\r\n");
      out.write("            display: grid;\r\n");
      out.write("            grid-template-columns: 75% 25%;\r\n");
      out.write("            height: 500px;\r\n");
      out.write("        }\r\n");
      out.write("        .left{\r\n");
      out.write("            background-image: url(https://i1.trekearth.com/photos/9081/dscf0549.jpg);\r\n");
      out.write("            background-size:cover;\r\n");
      out.write("            height:550px;\r\n");
      out.write("        }\r\n");
      out.write("        .right{\r\n");
      out.write("            background-color:#A0E4CB; \r\n");
      out.write("            padding:2px;\r\n");
      out.write("        }\r\n");
      out.write("        .container {\r\n");
      out.write("            margin-right: 20%;\r\n");
      out.write("            margin-left: 25%;\r\n");
      out.write("            margin-top: 8%;\r\n");
      out.write("            padding: 10px;  \r\n");
      out.write("            width:50%;\r\n");
      out.write("            height: 40%;\r\n");
      out.write("            border-style: groove;\r\n");
      out.write("            background: rgba(255, 255, 255, 0.2);\r\n");
      out.write("           border-radius: 20px;\r\n");
      out.write("          }      \r\n");
      out.write("        .btn{\r\n");
      out.write("            background-color: #04AA6D;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            border:black;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            width: 60%;\r\n");
      out.write("            margin-left: 20%;\r\n");
      out.write("            opacity: 0.9;\r\n");
      out.write("          }\r\n");
      out.write("          .btn:hover {\r\n");
      out.write("            opacity: 2;\r\n");
      out.write("          }\r\n");
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
      out.write("            background-color: #4CAF50; \r\n");
      out.write("            color: white; \r\n");
      out.write("            border: 2px solid #4CAF50;\r\n");
      out.write("          }\r\n");
      out.write("          \r\n");
      out.write("          .button1:hover {\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            color: black;\r\n");
      out.write("          }\r\n");
      out.write("          .box\r\n");
      out.write("          {\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("            width: 50%;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            margin-left: 25%;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 3px;\r\n");
      out.write("          }\r\n");
      out.write("          input[type=text]\r\n");
      out.write("          {\r\n");
      out.write("            width: 190px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("          }\r\n");
      out.write("          .select{\r\n");
      out.write("            width: 190px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("          }\r\n");
      out.write("           #alertBooked\r\n");
      out.write("          {\r\n");
      out.write("           border: solid 2px black;\r\n");
      out.write("           width:35%;\r\n");
      out.write("           border-radius: 20px;\r\n");
      out.write("            border-color: rgb(0, 0, 0);\r\n");
      out.write("            position: absolute;\r\n");
      out.write("                top: 230px;\r\n");
      out.write("                left: 260px;\r\n");
      out.write("            background-color: white;\r\n");
      out.write("            display: none;\r\n");
      out.write("            -webkit-box-shadow: 0 10px 6px -6px #777;\r\n");
      out.write("            -moz-box-shadow: 0 10px 6px -6px #777;\r\n");
      out.write("                 box-shadow: 0 10px 6px -6px #777;\r\n");
      out.write("          }\r\n");
      out.write("          #alertBooked p\r\n");
      out.write("          {\r\n");
      out.write("          \t\tfont-size: large;\r\n");
      out.write("          }\r\n");
      out.write("          #booked-history\r\n");
      out.write("          {\r\n");
      out.write("            width:80%;\r\n");
      out.write("            height: 80%;\r\n");
      out.write("            border: 2px solid black;\r\n");
      out.write("            border-radius: 15px;\r\n");
      out.write("            position: absolute;\r\n");
      out.write("            top:100px;\r\n");
      out.write("            left:70px;\r\n");
      out.write("            background-color: antiquewhite;\r\n");
      out.write("            display: none;\r\n");
      out.write("          }\r\n");
      out.write("          #cancel{\r\n");
      out.write("             font-weight:bolder; \r\n");
      out.write("             cursor:pointer;\r\n");
      out.write("             font-size: x-large;\r\n");
      out.write("             position: absolute;\r\n");
      out.write("             left: 95%;\r\n");
      out.write("          }\r\n");
      out.write("           #data {\r\n");
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
      out.write("    </style>\r\n");
      out.write("    <script>\r\n");
      out.write("        function check()\r\n");
      out.write("        {\r\n");
      out.write("            var pick = document.getElementById(\"pickUp\").value;\r\n");
      out.write("            var drop = document.getElementById(\"drop\").value;\r\n");
      out.write("            if(pick==drop)\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"pickup location and drop location can't be same\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            var time = document.getElementById(\"time\").value;\r\n");
      out.write("            var mode = document.getElementById(\"mode\").value;\r\n");
      out.write("        //    console.log(mode);\r\n");
      out.write("            time = parseInt(time);\r\n");
      out.write("            if(!(time>=6 && time<=12) && !(time>=1 && time<=12 && mode==\"PM\"))\r\n");
      out.write("            {\r\n");
      out.write("                alert(\"Taxi available only from 6AM to 12PM\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("        function cancel()\r\n");
      out.write("        {\r\n");
      out.write("\t\t\tdocument.getElementById(\"booked-history\").style.display=\"none\";\r\n");
      out.write("        }\r\n");
      out.write("        function showBooked()\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById(\"booked-history\").style.display=\"block\";\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
 
	// to prevent back button after logout ... we need block caching the memory in the browser.
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // suite for http 1.1
	response.setHeader("pragma","no-cache");  // for older versions HTTP 1.0
	response.setHeader("expires","0");  // for proxy users
	
	Customer cust = (Customer)session.getAttribute("cust"); 
	Object adminControl = session.getAttribute("admin-control");
	if(cust==null || adminControl!=null)
	{
		if(adminControl!=null)
		{
			response.sendRedirect("admin.jsp");
			return;
		}
		response.sendRedirect("home.jsp");
		return;
	} 
	
 TaxiImple.setCustomer(cust); 
      out.write("\r\n");
      out.write("\t <div class=\"top-container\">\r\n");
      out.write("            <h1 style=\"margin-left:20px; color:white\">Welcome ");
      out.print(cust.getUserName() );
      out.write(" :)</h1>\r\n");
      out.write("            <form action=\"logout\">\r\n");
      out.write("            <button class=\"button button1\" type=\"submit\">Logout</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>     \r\n");
      out.write("        <br>   \r\n");
      out.write("        <div class=\"A1\">\r\n");
      out.write("            <div class=\"left\"> \r\n");
      out.write("            <h1 style=\"text-align: center\">Book your trip</h1>\r\n");
      out.write("            <form action=\"bookTaxi\" onsubmit=\"return check()\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                <label for=\"pickUp\"><b>Select PickUp Location : </b></label>\r\n");
      out.write("                   <select class=\"select\" name=\"pickUp\" id=\"pickUp\">\r\n");
      out.write("                    <option value=\"A\">Borivali</option>\r\n");
      out.write("                    <option value=\"B\">National Park</option>\r\n");
      out.write("                    <option value=\"C\">Devipada</option>\r\n");
      out.write("                    <option value=\"D\">Magathane</option>\r\n");
      out.write("                    <option value=\"E\">Thakur Cinema</option>\r\n");
      out.write("                    <option value=\"F\">Thakur College</option>\r\n");
      out.write("                   </select>\r\n");
      out.write("                    <br><br>\r\n");
      out.write("                    <label for=\"drop\"><b>Select Drop Location : </b></label>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    <select class=\"select\" name=\"drop\" id=\"drop\">\r\n");
      out.write("                    <option value=\"A\">Borivali</option>\r\n");
      out.write("                    <option value=\"B\">National Park</option>\r\n");
      out.write("                    <option value=\"C\">Devipada</option>\r\n");
      out.write("                    <option value=\"D\">Magathane</option>\r\n");
      out.write("                    <option value=\"E\">Thakur Cinema</option>\r\n");
      out.write("                    <option value=\"F\">Thakur College</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                    <br><br>\r\n");
      out.write("                    \r\n");
      out.write("                    <label for=\"time\"><b>Enter PickUp Time : </b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                    <input type=\"text\" name=\"time\" id=\"time\" placeholder=\"Taxi Available after 6'o clock\" required>\r\n");
      out.write("                    <select name=\"mode\" id=\"mode\" style=\"height: 30px;\">\r\n");
      out.write("                        <option>AM</option>\r\n");
      out.write("                        <option>PM</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                        <br>  <br>\r\n");
      out.write("                    <button type=\"submit\" class=\"btn\">Book Taxi</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right\">\r\n");
      out.write("                <fieldset>\r\n");
      out.write("                    <legend> <h3> Details </h3></legend>\r\n");
      out.write("                <p>Name : ");
      out.print(cust.getUserName() );
      out.write("</p>\r\n");
      out.write("                <p>Email Id : ");
      out.print(cust.getEmailId() );
      out.write("</p>\r\n");
      out.write("                <p>Last Accessed Time : ");
      out.print(cust.getLastAccessedTime() );
      out.write("\r\n");
      out.write("                </fieldset>\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <button class=\"btn\" onclick=\"showBooked()\">View Booked History</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"booked-history\">\r\n");
      out.write("            <span id=\"cancel\" onclick=\"cancel()\">&times;</span>\r\n");
      out.write("            <h2>Booked History : </h2>\r\n");
      out.write("            <br>\r\n");
      out.write("            ");
 List<History> details = TaxiImple.getHistoryBasedOnCustomer(cust.getUserName()); 
      out.write("\r\n");
      out.write("            ");
 if(details.size()==0){ 
      out.write("\r\n");
      out.write("            <h2 style=\"text-align:center\">No History Found!</h2>\r\n");
      out.write("            ");
} 
      out.write("\r\n");
      out.write("            \r\n");
      out.write("                <table id=\"data\">\r\n");
      out.write("                 ");
 if(details.size()>0){ 
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Date</th>\r\n");
      out.write("                        <th>From</th>\r\n");
      out.write("                        <th>To</th>\r\n");
      out.write("                        <th>Amount</th>\r\n");
      out.write("                        <th>Taxi</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                    ");
 for(History hist : details){
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print( hist.getDate() );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( hist.getFromLocation() );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print( hist.getToLocation() );
      out.write("</td>\r\n");
      out.write("                        <td>Rs. ");
      out.print(hist.getAmount() );
      out.write("</td>\r\n");
      out.write("                        <td>Taxi ");
      out.print(hist.getTaxi_id() );
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
} 
      out.write("\r\n");
      out.write("                </table>\r\n");
      out.write("        </div>  \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
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
