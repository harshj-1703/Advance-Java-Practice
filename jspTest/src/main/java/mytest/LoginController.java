package mytest;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/logincheck")
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("username");
        String password = req.getParameter("password");
        AuthUser user = new AuthUser();
        user.setUsername(uname);
        user.setPassword(password);
        if(new AuthUserService().validate(user))
        {
            req.setAttribute("userdetails",user);
            req.getRequestDispatcher("dashboard.jsp").forward(req,resp);
        }
//        if(uname.equalsIgnoreCase(password))
//        {
//            req.getRequestDispatcher("dashboard.jsp").forward(req,resp);
//        }
    }
}
