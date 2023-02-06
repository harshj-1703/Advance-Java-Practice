import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ContactPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        ServletConfig config = getServletConfig();
        PrintWriter out = resp.getWriter();
        ServletContext context = req.getServletContext();
        out.println(context.getInitParameter("app_name"));
        out.println("<hr/>");
        out.println("Contact Person : "+config.getInitParameter("pname"));
        out.println("<br>Contact No : "+config.getInitParameter("contact_no"));
        out.println("<hr><a href= 'homepageservlet'><button type = 'submit'>GO TO HOME PAGE</button></a>");
    }
}
