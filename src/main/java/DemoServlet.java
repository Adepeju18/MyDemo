

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DemoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try
	{
		PrintWriter write = response.getWriter();	
		response.setContentType("text/html");
				String name = request.getParameter("uname");
				write.print("Hi "+name);
				
	}
	catch(Exception e) {
		System.out.println("some problem :"+e);
	}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		try
		{
			PrintWriter write = response.getWriter();	
			response.setContentType("text/html");
					String name = request.getParameter("uname");
					write.print("<h1>Hi "  +name +"</h1>");
					String pwd = request.getParameter("pass");
					write.print("<p>your password is "+pwd +"</p>");
		}
		catch(Exception e) {
			System.out.println("some problem :"+e);
		}
	}
	

}
