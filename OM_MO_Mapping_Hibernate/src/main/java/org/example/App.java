package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();

        Department department = new Department();
        department.setName("ICT");
        department.setBranch("FOT");

        Student student1 = new Student();
        student1.setName("Harsh");
        student1.setAge(19);
        student1.setDepartment(department);

        Student student2 = new Student();
        student2.setName("Vatsal");
        student2.setAge(20);
        student2.setDepartment(department);

        department.getStudents().add(student1);
        department.getStudents().add(student2);

        session.beginTransaction();
        session.save(department);
        session.save(student1);
        session.save(student2);
        session.getTransaction().commit();
        sessionFactory.close();
    }
}
