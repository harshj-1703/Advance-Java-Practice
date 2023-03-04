import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String name = servletRequest.getParameter("uname");
        String password = servletRequest.getParameter("password");
        System.out.println("From Auth Filter");
        if(isUserAuthetic(name,password))
        {
            filterChain.
                    doFilter(servletRequest,servletResponse);
        }
        else
        {
            HttpServletResponse resp =
                    (HttpServletResponse) servletResponse;
            resp.sendRedirect("login.html");
        }
    }

    private boolean isUserAuthetic(String name, String password) {
        if(name.equals(password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
