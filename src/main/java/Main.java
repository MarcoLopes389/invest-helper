import gui.WindowService;
import core.repositories.StockRepository;
import core.utils.JpaUtil;

public class Main {
    public static void main(String[] args) {

        var jpaUtil = new JpaUtil();
        var repository = new StockRepository(jpaUtil.getEntityManagerFactory());
        new WindowService(repository).createWindow();
    }
}
