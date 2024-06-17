package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        
        Configuration configuration = new Configuration();
        
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee(11, "DEF", "CSE", 79000);

        session.save(employee);
        
//        Student s1 = new Student( 1, "aaa" , "IT");
//        
//        session.save(s1);

        transaction.commit();

        session.close();

        sessionFactory.close();

        System.out.println("Employee saved successfully");
    }
}
