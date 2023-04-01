package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMapping {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Student stu = new Student();
        stu.setId(1);
        stu.setName("HJ");
        stu.setGender("M");
        stu.setAge(19);

        Subject sub = new Subject();
        sub.setId(101);
        sub.setName("Advance JAVA");
        sub.setDuration("6 Months");

        sub.setStudent(stu);
        stu.setSubject(sub);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(stu);
        session.save(sub);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
