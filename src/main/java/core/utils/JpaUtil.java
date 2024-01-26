package core.utils;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private EntityManagerFactory entityManagerFactory;

    public EntityManagerFactory getEntityManagerFactory() {
        if (this.entityManagerFactory == null) {
            this.entityManagerFactory = Persistence.createEntityManagerFactory("main");
        }
        return entityManagerFactory;
    }
}
