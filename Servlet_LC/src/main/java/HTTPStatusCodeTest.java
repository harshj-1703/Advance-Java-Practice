import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/httpcodes")
public class HTTPStatusCodeTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setStatus(200);
//        PrintWriter out = resp.getWriter();
//        resp.setContentType("text/html");
//        out.println("Hello How Are You!");
        resp.sendError(404,"File Not Found!");
    }
}
