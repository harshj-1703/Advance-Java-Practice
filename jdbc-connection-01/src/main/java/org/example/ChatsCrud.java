package org.example;

import org.example.models.ChatMessage;
import org.example.models.Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChatsCrud {
public static void main(String[] args)
{
    Users user = new Users(2,"HARSH","hj@1234",1);
    ChatMessage c = new ChatMessage(0,user.getUid(),1,"Hiii! How Are You?","");
    ChatMessage cDelete = new ChatMessage(3,user.getUid(),1,"Hiii! How Are You?","");
    ChatMessage cUpdate = new ChatMessage(3,user.getUid(),1,"I AM FINE","");

    //call add chat
    ChatsCrud c1 = new ChatsCrud();
    c1.addChat(c);

    //call delete chat
//    c1.deleteChat(cDelete);

    ///call update chat
//    c1.updateChat(cUpdate);
}

//add Chat into database
public static int addChat(ChatMessage c)
{
    int r = 0;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
        System.out.println("Connection Done");

        //Make PreparedStatement Insert
        PreparedStatement preparedStatementInsert = conn.prepareStatement("insert into chats(sender_id,receiver_id,msgContent) values (?,?,?)");

        //Set PreparedStatements
        preparedStatementInsert.setInt(1,c.getSender_id());
        preparedStatementInsert.setInt(2,c.getReceiver_id());
        preparedStatementInsert.setString(3,c.getMsgContent());

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

//delete chat from database
public static void deleteChat(ChatMessage c)
{
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
        System.out.println("Connection Done");

        int id = ChatMessage.getMsg_id();
        //Make PreparedStatement Insert
        PreparedStatement preparedStatementInsert = conn.prepareStatement("delete from chats where id = "+id+"");

        int i = preparedStatementInsert.executeUpdate();
        System.out.println("Total Rows Deleted: "+i);

        conn.close();
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

//update chat in database
public static void updateChat(ChatMessage c)
{
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");
        System.out.println("Connection Done");

        int id = ChatMessage.getMsg_id();
        //Make PreparedStatement Insert
        PreparedStatement preparedStatementInsert = conn.prepareStatement("update chats set msgContent = ? where id = "+id+"");

        //Set PreparedStatements
        preparedStatementInsert.setString(1,c.getMsgContent());

        int i = preparedStatementInsert.executeUpdate();
        System.out.println("Total Rows Updated: "+i);

        conn.close();
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

}
