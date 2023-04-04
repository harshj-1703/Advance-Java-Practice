package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person();
        p.setDob(new Date());
        p.setName("Raju");

        try {
            FileInputStream fs = new FileInputStream("src/main/resources/1.jpg");
            p.setMyImage(fs.readAllBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Address address = new Address();
        address.setStreet("my street");
        address.setCity("rajkot");
        address.setState("gj");
        address.setCountry("india");
        p.setAddress(address);
        try {
            p.setDob(new SimpleDateFormat("YYYY-MM-DD").parse("2023-05-01"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session =  factory.openSession();

        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();

        session.close();

        factory.close();

    }
}