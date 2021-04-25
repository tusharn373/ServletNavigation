import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class sendRedirect extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String uname=req.getParameter("uname");
		String pwd=req.getParameter("pwd");
		PrintWriter pw=res.getWriter();
		if(uname.equals("tushar") && pwd.equals("navghare"))
		{
			pw.print("Valid");
		}
		else
		{
			res.sendRedirect("Invalid");
		}
	}

}
