import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginhiddencheck")
public class CheckLoginHidden extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String uname = req.getParameter("uname");
        String password = req.getParameter("password");
        if(uname.equals(password))
        {
            PrintWriter out = resp.getWriter();
//            out.print("<form action = 'dashboard'");
//            out.print("<input type='hidden' value='"+uname+"' name='unm'");
//            out.print("<br><input type = 'submit'>");
//            out.print("</form>");
            out.println("<a href='dashboard?unm="+uname+"'>Click Me</a>");
            resp.sendRedirect("dashboard");
        }
        else
        {
            resp.getWriter().print("Invalid Credentials<br>");
            RequestDispatcher rs = req.getRequestDispatcher("/login.html");
            rs.include(req,resp);
        }
    }
}
