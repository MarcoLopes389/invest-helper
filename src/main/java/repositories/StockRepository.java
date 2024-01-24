package repositories;

import entities.Stock;
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

    public List<Stock> findAll() {
        var entityManager = this.getEntityManager();
        var result = entityManager.createQuery("from Stock", Stock.class).getResultList();
        entityManager.close();
        return result;
    }

    public void create(Stock stock) {
        var entityManager = this.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(stock);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public Stock findBySymbol(String symbol) {
        var entityManager = this.getEntityManager();
        var result = entityManager.createQuery("from Stock where symbol = ?1", Stock.class)
                .setParameter(1, symbol)
                .getResultList()
                .stream()
                .findFirst()
                .orElse(null);
        entityManager.close();
        return result;
    }
}
