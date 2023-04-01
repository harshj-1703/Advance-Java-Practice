package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

//        Student stuFirst = new Student();
//        stuFirst.setId(6);
//        stuFirst.setName("TAPAN");
//        stuFirst.setAge(20);
//        stuFirst.setGender("Male");
//
        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(stuFirst);
//        session.getTransaction().commit();
//        session.close();

        //update or get data
//        Student obj = session.load(Student.class, Integer.parseInt("6")); //for ensure data should there then get otherwise it use load
////        System.out.println(obj);
//        session.beginTransaction();
//        obj.setName("Renish");
////        obj.setAge(50);
//        session.getTransaction().commit();
//        System.out.println(obj.getId());

        Student s = new Student();
        s.setId(6);
        s.setName("Micheal");
        session.beginTransaction();
        session.update(s);
        session.getTransaction().commit();
        sessionFactory.close();
    }
}
