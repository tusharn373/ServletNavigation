package Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookies1 extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter pw=res.getWriter();
		//Cookies c[] = req.getCookies();
		Cookie cookies[]=req.getCookies();
		for(Cookie c : cookies)
		{
			if(c.getName().equals("name"))
				pw.print("Name is"+c.getValue());
		}
		for(Cookie c : cookies)
		{
			if(c.getName().equals("password"))
				pw.print(" Password is"+c.getValue());
		}
	}

}
