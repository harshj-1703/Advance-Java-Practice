package authUser;

import java.sql.*;

public class AuthUserService {
    public boolean validate(authUser.AuthUser authUser)
    {
//        //without database
//        if(authUser.getUsername().equalsIgnoreCase(authUser.getPassword()))
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }

        //with database
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            String name = authUser.getUsername();
            String password = authUser.getPassword();
            PreparedStatement preparedStatementLogin = conn.prepareStatement("select * from users where name = '"+name+"' AND password = '"+password+"'");

            ResultSet i = preparedStatementLogin.executeQuery();
//            System.out.println(i.first());
            if(i.first() == false)
            {
                System.out.println("Wrong Password!");
                return false;
            }
            else
            {
                System.out.println("User Login Successfully!");
                return true;
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
