package org.example;

import org.example.models.ChatMessage;
import org.example.models.Users;

import java.sql.*;

public class UserCrud {
    public static void main(String[] args)
    {
        Users user = new Users(0,"PRATHAM","p@1234",1);
        Users userDelete = new Users(1,"HARSH","h@1234",1);
        Users userUpdate = new Users(2,"PRATHAM","p@1234",1);

        UserCrud u = new UserCrud();

        //add Users
//        u.addUsers(user);

        //update Users
//        u.updateUsers(userUpdate);

        //Delete Users
//        u.deleteUsers(userDelete);

        //Login
        u.Login(user);
    }

    public static void addUsers(Users u)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            //Make PreparedStatement Insert
            PreparedStatement preparedStatementInsert = conn.prepareStatement("insert into users(name,password) values (?,?)");

            //Set PreparedStatements
            preparedStatementInsert.setString(1,u.getUname());
            preparedStatementInsert.setString(2,u.getPassword());

            int i = preparedStatementInsert.executeUpdate();
            System.out.println("Total Rows Inserted: "+i);

            conn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteUsers(Users u)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            int id = Users.getUid();
            //Make PreparedStatement Insert
            PreparedStatement preparedStatementInsert = conn.prepareStatement("delete from users where id = "+id+"");

            int i = preparedStatementInsert.executeUpdate();
            System.out.println("Total Rows Deleted: "+i);

            conn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateUsers(Users u)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            int id = Users.getUid();
            //Make PreparedStatement Insert
            PreparedStatement preparedStatementInsert = conn.prepareStatement("update users set name = ?, password = ? where id = "+id+"");

            //Set PreparedStatements
            preparedStatementInsert.setString(1,u.getUname());
            preparedStatementInsert.setString(2,u.getPassword());

            int i = preparedStatementInsert.executeUpdate();
            System.out.println("Total Rows Updated: "+i);

            conn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void Login(Users u)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            String name = u.getUname();
            String password = u.getPassword();
            PreparedStatement preparedStatementLogin = conn.prepareStatement("select * from users where name = '"+name+"' AND password = '"+password+"'");

            ResultSet i = preparedStatementLogin.executeQuery();
//            System.out.println(i.first());
            if(i.first() == false)
            {
                System.out.println("Wrong Password!");
            }
            else
            {
                System.out.println("User Login Successfully!");
            }

            conn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
