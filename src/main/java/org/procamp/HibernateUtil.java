package org.procamp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() throws SecurityException{
        if (sessionFactory == null) {
            sessionFactory = new Configuration().configure()
                    .addAnnotatedClass(User.class)
                    .addAnnotatedClass(Report.class)
                    .addAnnotatedClass(Activity.class)
                    .addAnnotatedClass(Building.class)
                    .addAnnotatedClass(Material.class)
                    .buildSessionFactory();
        }
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }
}
