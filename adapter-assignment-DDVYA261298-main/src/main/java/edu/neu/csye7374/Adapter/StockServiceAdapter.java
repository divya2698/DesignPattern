package edu.neu.csye7374.Adapter;

import edu.neu.csye7374.Interfaces.StockService;
import edu.neu.csye7374.Stocks.Stock;
import edu.neu.csye7374.Factories.EagerSingletonTeslaStockFactory; //had to add for the demo
import edu.neu.csye7374.Interfaces.LegacyStockService;

public class StockServiceAdapter implements StockService {
    private final LegacyStockService legacyStockService;

    public StockServiceAdapter(LegacyStockService legacyStockService) {
        this.legacyStockService = legacyStockService;
    }

    @Override
    public void buyStock(Stock stock, int quantity) {
       int availableQuantity = legacyStockService.getAvailableQuantity(stock);
         if (availableQuantity >= quantity) {
            System.out.println("Buying " + quantity + " stocks of " + stock.getName());
            stock.setQuantity(availableQuantity - quantity);

            //update the price based on quantity
            double currentPrice = legacyStockService.getCurrentPrice(stock);
            currentPrice += quantity;
            stock.setPrice(currentPrice);
        } else {
            System.out.println("Not enough stocks available to buy " + quantity + " stocks of " + stock.getName());
        }
    }

    @Override
    public void sellStock(Stock stock, int quantity) {
        int availableQuantity = legacyStockService.getAvailableQuantity(stock);
        System.out.println("Selling " + quantity + " stocks of " + stock.getName());
        stock.setQuantity(availableQuantity + quantity);

        //reduce the price based on quantity sold
        double currentPrice = legacyStockService.getCurrentPrice(stock);
        currentPrice -=  quantity;
        stock.setPrice(currentPrice);
    }

    @Override
    public void displayStockDetails(Stock stock) {
        // Additional method implementation in the Client API
        String name = stock.getName();
        double currentPrice = legacyStockService.getCurrentPrice(stock);
        int availableQuantity = legacyStockService.getAvailableQuantity(stock);

        System.out.println("====================================");
        System.out.println("Stock Details: " + name);
        System.out.println("Current Price: " + currentPrice);
        System.out.println("Available Quantity: " + availableQuantity);
        System.out.println("====================================");
    }

    public static void demo() {
        // Create the stock
        EagerSingletonTeslaStockFactory eagerSingletonTeslaStockFactory = EagerSingletonTeslaStockFactory.getInstance();
        Stock teslaStock = eagerSingletonTeslaStockFactory.createStock();

        // Create the adapter
        LegacyStockService legacyStockService = new LegacyStockServiceImpl();
        StockService stockService = new StockServiceAdapter(legacyStockService);
        stockService.displayStockDetails(teslaStock);
        
        // Use the adapted client API
        stockService.buyStock(teslaStock, 200);
        stockService.displayStockDetails(teslaStock);
        
        stockService.sellStock(teslaStock, 200);
        stockService.displayStockDetails(teslaStock);
    }
}