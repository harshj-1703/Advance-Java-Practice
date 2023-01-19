package org.example;
//import scanner class for input
import java.sql.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ChatMessage
{
    public static void main( String[] args )
    {
        //create object of scanner class
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name Of Sender : ");
        //Read User Input
        String sender = sc.nextLine();

        System.out.println("Enter Name Of Receiver : ");
        //Read User Input
        String receiver = sc.nextLine();

//        System.out.println("Sender is : "+sender);

        //check sender
        senderCheck(sender);
        receiverCheck(receiver);

        System.out.println("Enter Chat Message : ");
        //Read User Input
        String message = sc.nextLine();

        //send message
        sendMessage(sender,receiver,message);

    }

    private static void senderCheck(String sender)
    {
        try {
            //connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");

            PreparedStatement preparedStatement = conn.prepareStatement("select * from assignment1_users where name = ?");
            preparedStatement.setString(1,sender);

            ResultSet resultSet = preparedStatement.executeQuery();

//            System.out.println(resultSet.next());

            if(resultSet.next())
            {
                System.out.println("Sender Found!");
            }
            else
            {
                PreparedStatement preparedStatement1 = conn.prepareStatement("insert into assignment1_users (name) values (?)");
                preparedStatement1.setString(1,sender);
                preparedStatement1.execute();

                System.out.println("Sender not found creating it!");
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void receiverCheck(String reciever)
    {
        try {
            //connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");

            PreparedStatement preparedStatement = conn.prepareStatement("select * from assignment1_users where name = ?");
            preparedStatement.setString(1,reciever);

            ResultSet resultSet = preparedStatement.executeQuery();

//            System.out.println(resultSet.next());

            if(resultSet.next())
            {
                System.out.println("Receiver Found!");
            }
            else
            {
                PreparedStatement preparedStatement1 = conn.prepareStatement("insert into assignment1_users (name) values (?)");
                preparedStatement1.setString(1,reciever);
                preparedStatement1.execute();

                System.out.println("Receiver not found creating it!");
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sendMessage(String sender, String receiver, String message)
    {
        try {
            //connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java","root","");

            PreparedStatement preparedStatementSender = conn.prepareStatement("select * from assignment1_users where name = ?");
            preparedStatementSender.setString(1,sender);

            PreparedStatement preparedStatementReceiver = conn.prepareStatement("select * from assignment1_users where name = ?");
            preparedStatementReceiver.setString(1,receiver);

            ResultSet senderSet = preparedStatementSender.executeQuery();
            ResultSet receiverSet = preparedStatementReceiver.executeQuery();

            if(senderSet.first() && receiverSet.first())
            {
                int senderId = senderSet.getInt("id");
                int receiverId = receiverSet.getInt("id");
//                System.out.println(senderId + " " + receiverId);

                if(senderId == receiverId)
                {
                    System.out.println("Sender and Receiver can't be a same!");
                }
                else
                {
                    //add in the chat
                    PreparedStatement preparedStatementChat = conn.prepareStatement("Insert into assignment1_chats (senderId,receiverId,message) Values (?,?,?)");
                    preparedStatementChat.setInt(1,senderId);
                    preparedStatementChat.setInt(2,receiverId);
                    preparedStatementChat.setString(3,message);

                    preparedStatementChat.execute();
                    System.out.println("Chat has been added");

                }
            }
            else
            {
                throw new RuntimeException("Error!");
            }


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
