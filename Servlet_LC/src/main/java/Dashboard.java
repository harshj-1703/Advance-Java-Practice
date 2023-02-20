import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/dashboard")
public class Dashboard extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        Cookie[] c = req.getCookies();
//        String name = "";
//        PrintWriter out1 = resp.getWriter();
//        for (Cookie cookie : c)
//        {
//            out1.println(cookie.getName()+" "+cookie.getValue()+"<br>");
//            if(cookie.getName().equals("uname"))
//            {
//                name = cookie.getValue();
//            }
//        }
//        PrintWriter out = resp.getWriter();
//        out.println("Welcome! "+name);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doGet(req,resp);
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("unm");
//        for (Cookie cookie : c)
//        {
//            out1.println(cookie.getName()+" "+cookie.getValue()+"<br>");
//            if(cookie.getName().equals("uname"))
//            {
//                name = cookie.getValue();
//            }
//        }
        PrintWriter out = resp.getWriter();
        out.println("Welcome! "+name);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
