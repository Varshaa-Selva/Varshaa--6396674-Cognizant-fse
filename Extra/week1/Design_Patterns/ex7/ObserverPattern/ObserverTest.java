public class ObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("Groww");
        Observer web = new WebApp("NSE India");

        market.registerObserver(mobile);
        market.registerObserver(web);

        System.out.println("First Update:");
        market.setStockData("TATA Motors", 845.25);

        System.out.println("\nSecond Update:");
        market.setStockData("Infosys", 1510.60);

        System.out.println("\nRemoving Mobile App...");
        market.removeObserver(mobile);

        System.out.println("\nThird Update:");
        market.setStockData("Reliance", 2850.00);
    }
}
