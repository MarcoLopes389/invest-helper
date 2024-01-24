package repositories;

import entities.StockEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class StockRepository {
    private EntityManagerFactory factory;

    public StockRepository(EntityManagerFactory factory) {
        this.factory = factory;
    }

    private EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public List<StockEntity> findAll() {
        var entityManager = this.getEntityManager();
        var result = entityManager.createQuery("from Stock", StockEntity.class).getResultList();
        entityManager.close();
        return result;
    }

    public void create(StockEntity stock) {
        var entityManager = this.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(stock);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public StockEntity findBySymbol(String symbol) {
        var entityManager = this.getEntityManager();
        var result = entityManager.createQuery("from Stock where symbol = ?1", StockEntity.class)
                .setParameter(1, symbol)
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);
        entityManager.close();
        return result;
    }
}
