import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/servlettest")
public class LCServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("from init method");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("from service method");
        PrintWriter out = servletResponse.getWriter();
        out.println("hiii helloo!");
    }

    @Override
    public String getServletInfo() {
        return "getServletInfo";
    }

    @Override
    public void destroy() {
        System.out.println("Destroyed");
    }
}
