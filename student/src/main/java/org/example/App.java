package org.example;

import org.example.models.Students;

import java.sql.*;

public class App 
{
    public static void main( String[] args )
    {
        Students user1 = new Students(1,"HARSH","h@1234",1);
        Students user2 = new Students(0,"PRATHAM","p@1234",1);
        Students userInactive = new Students(0,"KASHYAP","k@1234",0);
        Students studentDelete = new Students(0,"xyz","",1);
        Students studentsUpdate = new Students(2,"PRATHAM","p@1234",1);

        App u = new App();

        //insert 2 Students
        u.addStudents(user1);
        u.addStudents(user2);

        //update one by id
        u.updateStudents(studentsUpdate);

        //fetch all students
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            //Make statement
            Statement statement = conn.createStatement();
            String qry = "select * from student";
            ResultSet rs = statement.executeQuery(qry);
            //print data of set with while loop
            while (rs.next())
            {
                System.out.print(rs.getString("roll_no")+"->");
                System.out.println(rs.getString(3));
            }

            //close connection
            conn.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        //Delete Users
        u.deleteStudents(studentDelete);

        //add 1 new student with the status inactive.
        u.addStudents(userInactive);

      }

    public static void addStudents(Students u)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            //Make PreparedStatement Insert
            PreparedStatement preparedStatementInsert = conn.prepareStatement("insert into users(name,password,status) values (?,?,?)");

            //Set PreparedStatements
            preparedStatementInsert.setString(1,u.getUname());
            preparedStatementInsert.setString(2,u.getPassword());
            preparedStatementInsert.setInt(3,u.getStatus());

            int i = preparedStatementInsert.executeUpdate();
            System.out.println("Total Rows Inserted: "+i);

            conn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateStudents(Students u)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            int id = Students.getUid();
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

    public static void deleteStudents(Students u)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            int id = Students.getUid();
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
}
