package Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("uname");
		String password=req.getParameter("pwd");
		if(name.equals("tushar") && password.equals("navghare"))
		{
			Cookie c1=new Cookie("name", name);
			Cookie c2=new Cookie("password", password);
			res.addCookie(c1);
			res.addCookie(c2);
			pw.print("<br><a href='Cookies1'>View Details</a>");
		}
		else
			pw.print("Invalid");
			
			
	}

}
