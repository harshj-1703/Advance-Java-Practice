import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        PrintWriter out = servletResponse.getWriter();
        out.println("From Filter ");
        System.out.println("From Filter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
