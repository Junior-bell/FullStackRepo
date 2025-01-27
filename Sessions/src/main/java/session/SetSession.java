package session;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SetSession
 */
public class SetSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("book1");
		String s2=request.getParameter("book2");
		String s3=request.getParameter("book3");
		HttpSession hs=request.getSession();
		hs.setAttribute("book1",s1);
		hs.setAttribute("book2",s2);
		hs.setAttribute("book3",s3);
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=wheat text=blue><center>");
		pw.println("<h1>your books are added to the cart</h1>");
		String s=response.encodeURL("get");
		pw.println("<a href=get>Next</a>");//set sessions with url rewriting.if removed will be set sessions with cookies.
		pw.println("</center></body></html>");
	}

}
