import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/generictest")
public class LCGenericServlet extends GenericServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("From init");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("From service generic");
        servletResponse.setContentType("html/text");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("From service method");
    }

    public void destroy()
    {
        System.out.println("From destroy");
    }
}
