import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/servletone")
public class ServletOne extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String para = req.getParameter("para");
        resp.setContentType("text/html");
        resp.setIntHeader("Refresh",5);
        req.setAttribute("newPara","hi there");
        PrintWriter out = resp.getWriter();
        out.println("Hi "+para);
        RequestDispatcher rd = req.getRequestDispatcher("servlettwo");
//        rd.forward(req,resp);
        rd.include(req,resp);
        out.println("This is after call");
        resp.sendRedirect("https://www.google.com");      //redirect at new url
    }
}