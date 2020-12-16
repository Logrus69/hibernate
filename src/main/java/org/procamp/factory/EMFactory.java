package org.procamp.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Objects;

public class EMFactory {
    private static EntityManagerFactory instance;

    private EMFactory () {
    }
    public static EntityManager getEntityManager() {
        if (Objects.isNull(instance)) {
            instance = Persistence.createEntityManagerFactory("org.procamp.data.hibernate");
        }
        return instance.createEntityManager();
    }
}
