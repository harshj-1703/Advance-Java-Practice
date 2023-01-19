package org.example;

import java.sql.*;

public class DbConnection3 {
    public static void main(String[] args)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");

//            //callable statement call procedure
//            CallableStatement callableStatement = conn.prepareCall("{call updateStudent(?)}");
//            callableStatement.setInt("s",6);
//            ResultSet rs = callableStatement.executeQuery();
//
//            //get metadata about table
//            ResultSetMetaData resultSetMetaData = rs.getMetaData();
//            //get column count
//            int colCount = resultSetMetaData.getColumnCount();
//            System.out.println(colCount);
//
//            while (rs.next())
//            {
//                for(int i=1;i<=colCount;i++)
//                {
//                    System.out.print(resultSetMetaData.getColumnLabel(i)+"->"+rs.getString(i));
//                    System.out.print("  ");
//                }
//                System.out.println();
//            }
//
//
//            //get metadata for database
//            System.out.println("--------------------------------");
//            System.out.println("DataBase MetaData");
//            DatabaseMetaData d = conn.getMetaData();
//            System.out.println(d.getDatabaseProductName());
//            System.out.println(d.getDatabaseProductVersion());
//            System.out.println(d.getUserName());
//            System.out.println(d.getDriverName());


            //ACID property -> Transections
            conn.setAutoCommit(false);
            int s = 6;
            PreparedStatement preparedStatement = conn.prepareStatement("update student set sem = ?");
            preparedStatement.setInt(1,s);
            preparedStatement.executeUpdate();  //use execute update for update

            PreparedStatement preparedStatement1 = conn.prepareStatement("select * from student");
            ResultSet rs1 = preparedStatement1.executeQuery();
            ResultSetMetaData resultSetMetaData1 = rs1.getMetaData();
            int colCount1 = resultSetMetaData1.getColumnCount();
            System.out.println(colCount1);
//            conn.commit();


            conn.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
