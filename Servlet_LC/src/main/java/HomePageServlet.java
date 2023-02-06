import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomePageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        ServletConfig config = getServletConfig();
        ServletContext context = req.getServletContext();
        out.println(context.getInitParameter("app_name"));
        out.println("<hr/>");
        out.println(config.getInitParameter("page_name"));
        out.println("<hr><a href= 'httpcontactpage'><button type = 'submit'>GO TO CONTACT PAGE</button></a>");
    }
}
