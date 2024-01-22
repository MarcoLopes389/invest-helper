import clients.mFinanceClient;
public class Main {
    public static void main(String[] args) {
        var client = new mFinanceClient();
        var stocks = client.findAllStocks();
//        System.out.println(stocks.getStocks());
        var prio = client.findOne("PRIO3");
        System.out.println(prio.getHigh());
    }
}
