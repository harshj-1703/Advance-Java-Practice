package org.example;
import org.example.models.Blog;

import java.sql.*;
public class BlogsCrud_DbConnection2 {
    public static void main( String[] args )
    {
        //Blog class object
        Blog b = new Blog(0,"INDIA","WORLD BEST COUNTRY","HJ","");

        //call method addBlog
        BlogsCrud_DbConnection2 blogsCrudDbConnection21 = new BlogsCrud_DbConnection2();
        BlogsCrud_DbConnection2.addBlog(b);
    }

    //add blog method
    public static int addBlog(Blog b) {
        int r=0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
            System.out.println("Connection Done");

            //Make PreparedStatement Insert
            PreparedStatement preparedStatementInsert = conn.prepareStatement("insert into blogs(title,content,author) values (?,?,?)");

            //Set PreparedStatements
            preparedStatementInsert.setString(1,b.getTitle());
            preparedStatementInsert.setString(2,b.getContent());
            preparedStatementInsert.setString(3,b.getAuthor());

            int i = preparedStatementInsert.executeUpdate();
            System.out.println("Total Rows Inserted: "+i);

            conn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return r;
    }
}
