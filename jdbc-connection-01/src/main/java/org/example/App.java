package org.example;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            //Make statement
            Statement statement = conn.createStatement();

            //Insert query
//            String insertQry = "insert into student (roll_no,name) values(43,'michael'),(41,'jean')";
//            int i = statement.executeUpdate(insertQry);
//            System.out.println("Total rows inserted : "+i);

            //Delete query
//            String deleteQry = "delete from student where name LIKE 'm%'";
//            int j = statement.executeUpdate(deleteQry);
//            System.out.println("Total rows deleted : "+j);

            //Update query
//            String name = "Harsh";
//            String updateQry = "update student set name='"+name+"' where roll_no=24";
//            int k = statement.executeUpdate(updateQry);
//            System.out.println("Total rows updated : "+k);

            //select query
            String qry = "select * from student";
//            String qry = "select * from student where name LIKE '%m%'";
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
    }
}
