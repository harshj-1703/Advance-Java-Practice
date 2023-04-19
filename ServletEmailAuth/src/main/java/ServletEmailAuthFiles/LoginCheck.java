package ServletEmailAuthFiles;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logincheck")
public class LoginCheck extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        if (email.equals(password)) {
            resp.getWriter().print("Successfull Login<br>");
            RequestDispatcher rs = req.getRequestDispatcher("/login.html");
            rs.include(req, resp);
        } else {
            resp.getWriter().print("Invalid Credentials<br>");
            RequestDispatcher rs = req.getRequestDispatcher("/login.html");
            rs.include(req, resp);
        }
    }
}
