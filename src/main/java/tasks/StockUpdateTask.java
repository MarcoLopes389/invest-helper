package tasks;

import clients.mFinanceClient;
import dtos.mFinanceStockDetailsDto;
import entities.StockEntity;
import repositories.StockRepository;

import java.util.TimerTask;

public class StockUpdateTask extends TimerTask {

    private StockRepository stockRepository;
    public StockUpdateTask(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }
    @Override
    public void run() {
        System.out.println("runnig task to update stocks");
        var client = new mFinanceClient();
        var stocks = client.findAllDetails();
        System.out.println(stocks);

        for (mFinanceStockDetailsDto stock : stocks.getIndicators()) {
            var exists = stockRepository.findBySymbol(stock.getSymbol());
            if (exists == null) {
                var entity = new StockEntity(
                        null,
                        null,
                        stock.getSymbol(),
                        stock.getPriceToBookValue().getValue(),
                        stock.getReturnOnEquity().getValue(),
                        stock.getReturnOnInvestedCapital().getValue(),
                        stock.getReturnOnAssets().getValue(),
                        stock.getDividendYield()
                );
                stockRepository.create(entity);
            }
        }
    }
}
