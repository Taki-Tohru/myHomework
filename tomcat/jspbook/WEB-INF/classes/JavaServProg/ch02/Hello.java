// page 40
//

package JavaServProg.ch02;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("name");
		out.println("<html>");
		out.println("<head><title>Hello, " + name + "</title></head>");
		out.println("<body>");
		out.println("Hello, " + name);
		out.println("</body></html>");
	}

	public String getServletInfo() {
		return "A servlet that knows the name of the person to whom it's" + "saying hello";
	}
}
