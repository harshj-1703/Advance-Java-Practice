package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

public class TestHQL {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
//        Person p = session.load(Person.class, 1);
//        System.out.println(p.getName());

        //HQL
//        String query = "select p.name,p.id From Person p where p.id =:pid order by p.name desc";

        //update query
//        String query = "update  Person  set name=:name where id=:pid";
//        Query q = session.createQuery(query);

//        q.setParameter("pid",1);
//        q.setParameter("name","HJ");
//        int i = q.executeUpdate();

        //delete query
//        String query = "Delete from Person where id = :pid";
//        Query q = session.createQuery(query);
//
//        q.setParameter("pid",1);
//        int i = q.executeUpdate();

        //insert query
        String hql = "Insert into Person(name) select p.name from Person p";
        Query q = session.createQuery(hql);
        int r = q.executeUpdate();

//        List<Object[]> res = q.list();
//        Iterator itr = res.iterator();
//        while (itr.hasNext()){
//            Person temp = (Person) itr.next();
//            System.out.println(temp.getName());
//        }
//        for(Object[] temp:res){
//            System.out.println(temp[0]+ " "+temp[1]);
//        }

        session.close();
        factory.close();
    }
}
