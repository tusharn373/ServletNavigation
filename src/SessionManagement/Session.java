package SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("uname");
		String password=req.getParameter("pwd");
		if(name.equals("tushar") && password.equals("navghare"))
		{
			HttpSession session=req.getSession();
			session.setAttribute("uname", name);
			session.setAttribute("upass", password);
			pw.print("Welcome " + name);
			pw.print("<br> <a href='Details'>View Details</a>");
		}
		else
			pw.print("Invalid");
	}

}
