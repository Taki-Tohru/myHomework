// page 42


package JavaServProg.ch02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello3 extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
	
		// Set the Content-Type header
		res.setContentType("text/html");
		// Return early if this is a HEAD
		if (req.getMethod().equals("HEAD")) return;

		// Proceed otherwise
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		out.println("<html>");
		out.println("<head><title>Hello, " + name + "</title></head>");
		out.println("<body>");
		out.println("Hello, " + name);
		out.println("</body></html>");
	}
}
