import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
@WebServlet("/servlettwo")
public class ServletTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
        String p = req.getParameter("p");
        String n = (String)req.getAttribute("newPara");
        PrintWriter out = resp.getWriter();
        out.println("P : "+p);
        out.println("N : "+n);
        out.println(new Date());
    }
}