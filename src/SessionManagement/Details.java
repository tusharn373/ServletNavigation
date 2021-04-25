package SessionManagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Details extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		HttpSession session=req.getSession();
		String name=(String) session.getAttribute("uname");
		String upass=(String) session.getAttribute("upass");
		PrintWriter pw=res.getWriter();
		pw.print("Name is "+name+" Qualification is BE 2019 passout");
		pw.print("<br>Password is "+upass);
	}

}
