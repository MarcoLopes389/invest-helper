import gui.WindowService;
import repositories.StockRepository;
import utils.JpaUtil;

public class Main {
    public static void main(String[] args) {

        var jpaUtil = new JpaUtil();
        var repository = new StockRepository(jpaUtil.getEntityManagerFactory());
        new WindowService().createWindow();
    }
}
