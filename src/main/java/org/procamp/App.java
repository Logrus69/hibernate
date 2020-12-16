package org.procamp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.procamp.delegate.UserDelegate;

import javax.persistence.*;

public class App {
    public static void main(String[] args) {

       /* SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Building building = new Building();
        //building.setInst_id(13L);
        building.setReportId(10L);
        building.setBuildingName("Home");
        building.setActive(false);

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(building);
        session.getTransaction().commit();
        session.close();*/

        User user = new User();
        user.setEmail("test@test.test");
        user.setLastName("Ivanov");
        user.setUserName("Ivan");
        user.setEmailBackup("test2@test2.test2");
        user.setTn("tn");
        user.setTnBackup("tn_backup");
        UserDelegate userDelegate = new UserDelegate();
        userDelegate.createUser(user);
    }
}
