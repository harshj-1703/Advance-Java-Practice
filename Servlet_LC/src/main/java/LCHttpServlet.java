import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@WebServlet("/httpservlet")
public class LCHttpServlet extends HttpServlet {
    @Override
    public void init() throws ServletException
    {
        super.init();
        System.out.println("from init");
    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req,resp);
//        System.out.println("From Service");
//        PrintWriter out = resp.getWriter();
//        out.println("Hi How are you?");
//    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();
//        int tableNumber = Integer.parseInt(req.getParameter("table"));
//        for (int i=1;i<11;i++)
//        {
//            int tableOutput = tableNumber * i;
//            out.println(tableNumber + " * "+ i + " = " + tableOutput);
//        }

        PrintWriter out = resp.getWriter();
        String date1 = req.getParameter("date");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        out.println(now);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("uname");
        String password = req.getParameter("password");
        if(name.equals(password))
        {
            out.println("Wrong Credintial");
        }
        else
        {
            out.println("Right Credintial");
        }
    }

    @Override
    public void destroy()
    {
        super.destroy();
        System.out.println("From Destroy");
    }
}
