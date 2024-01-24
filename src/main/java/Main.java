import repositories.StockRepository;
import utils.JpaUtil;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        var jpaUtil = new JpaUtil();
        var repository = new StockRepository(jpaUtil.getEntityManagerFactory());
        var frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
