import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	// ÖØŒ‘doGet()
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		pw.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">");
		pw.println("<head>");
		pw.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
		pw.println("<!-- The Servlet expression tags interpolate script variables into the HTML -->");
		pw.println("<title>Hello, world!</title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1>Hello, world!</h1>");
		pw.println("</body>");
		pw.close();
	}
	public HelloServlet() {}
}
