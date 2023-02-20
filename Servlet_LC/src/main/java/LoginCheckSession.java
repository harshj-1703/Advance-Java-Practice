import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/loginchecksession")
public class LoginCheckSession extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String uname = req.getParameter("uname");
        String password = req.getParameter("password");

        if(uname.equals(password))
        {
            HttpSession session = req.getSession();
            session.setAttribute("unm",uname);
            resp.sendRedirect("homepagesession");
        }
        else
        {
            PrintWriter out = resp.getWriter();
            out.println("<br>Wrong password<br/>");
            req.getRequestDispatcher("login.html").include(req,resp);
        }
    }
}
