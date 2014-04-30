package com.bookstore.generated;

import org.hibernate.IdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import javax.persistence.Id;

/**
 * Created by James on 30/04/14.
 */
public class Test {

    public static void main(String args[]) {
        SessionFactory factory = buildSessionFactory();
        try {
            Session session = factory.openSession();
            AuthorsEntity authors =
                    (AuthorsEntity)session.get(AuthorsEntity.class, Id.class);
            System.err.println(authors.getFirstName());
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

    }

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
           return  new Configuration().configure().buildSessionFactory(
                    new StandardServiceRegistryBuilder().build());
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
