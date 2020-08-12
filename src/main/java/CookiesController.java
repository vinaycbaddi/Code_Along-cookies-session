

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CookiesController
 */
@WebServlet(urlPatterns = {"/CookiesController"})
public class CookiesController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		Cookie ck = new Cookie("Username", name);
		response.addCookie(ck);
		
		HttpSession session = request.getSession();
		session.setAttribute("Password", pass);
		
		response.sendRedirect("result.jsp");
	}

}
