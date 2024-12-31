package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockMarket {
	private static StockMarket instance;
    private List<Stock> stocks;
    private StockMarket(){
        instance = null;
    };
    public static synchronized StockMarket getInstance(){
        if (instance == null) {
            instance =  new StockMarket();
            instance.stocks = new ArrayList<>();
        }
        return instance;
    }

    public void addStock(Stock stock) {
        getInstance().stocks.add(stock);
    }

    public void trade (Stock st,int metric){
     if(metric < 0){
     System.out.println("Tradin the " + st.getName() + " stock");
     }
     else if(metric > 0){
        System.out.println("Buying the " + st.getName() + " stock");
     }
     else{
         System.out.println("Holding the " + st.getName() + " stock");
     }
    }

    public static void demo() {
    	
     
        StockMarket market = StockMarket.getInstance();
        System.out.println("Initial stocks");
        System.out.println(market.toString());
        
        AbstractStockFactory st_1 =  IBMStockFactoryLazy.getInstance();
        Stock st1 = st_1.getObject("IBM", 260, "IBM IT Solutions");

        AbstractStockFactory st_2 =  TeslaStockFactoryLazy.getInstance();
        Stock st2 = st_2.getObject("Tesla", 318, "Tesla Mototrs");

         AbstractStockFactory st_3 =  IBMStockFactoryEager.getInstance();
        Stock st3 = st_3.getObject("IBM - 2", 152, "IBM IT Solutions");

        AbstractStockFactory st_4 =  TeslaStockFactoryEager.getInstance();
        Stock st4 = st_4.getObject("Tesla - 2", 485, "Tesla Mototrs");
       
        market.addStock(st1);
        market.addStock(st2);
        market.addStock(st3);
        market.addStock(st4);
        System.out.println(st1 + " added.");
        System.out.println(st2 + " added.");
        System.out.println(st3 + " added.");
        System.out.println(st4 + " added.");
        System.out.println(market.toString());

        Random r = new Random();
        int low = 100;
        int high = 450;

        System.out.println("-----BearStrategy-----");
        for(int i = 0; i < 5 ; i++){
            double randomBid = (double)r.nextInt(high-low) + low;
            double price = (double)r.nextInt(high-low) + low;
            
             st1.setBid(randomBid);
             st1.setPrice(price);
             System.out.println("The Bid is " + st1.getBid());
             
             System.out.println("The price is " + st1.getPrice());

            Context context = new Context(new BearStrategy());
            int metric = context.getMetric(st1.getBid(), st1.getPrice());
            market.trade(st1, metric);

            System.out.println("The metric is " + metric);
        }

        System.out.println("\n\n");
         System.out.println("-----BearStrategySingleton - Eager-----");
        for(int i = 0; i < 5 ; i++){
            double randomBid = (double)r.nextInt(high-low) + low;
            double price = (double)r.nextInt(high-low) + low;
            
             st2.setBid(randomBid);
             st2.setPrice(price);
             System.out.println("The Bid is " + st2.getBid());
             
             System.out.println("The price is " + st2.getPrice());

            Context context = new Context(new BearStrategy());
            int metric = context.getMetric(st2.getBid(), st2.getPrice());
            market.trade(st2, metric);

            System.out.println("The metric is " + metric);
        }

        System.out.println("\n\n");

        System.out.println("-----BullStrategy-----");
        for(int i = 0; i < 5 ; i++){
            double randomBid = (double)r.nextInt(high-low) + low;
            double price = (double)r.nextInt(high-low) + low;
            
             st3.setBid(randomBid);
             st3.setPrice(price);
             System.out.println("The Bid is " + st3.getBid());
             
             System.out.println("The price is " + st3.getPrice());

            Context context = new Context(new BearStrategy());
            int metric = context.getMetric(st3.getBid(), st3.getPrice());
            market.trade(st3, metric);

            System.out.println("The metric is " + metric);
        }

         System.out.println("\n\n");

        System.out.println("-----BullStrategySingleton - Lazy-----");
        for(int i = 0; i < 5 ; i++){
            double randomBid = (double)r.nextInt(high-low) + low;
            double price = (double)r.nextInt(high-low) + low;
            
             st4.setBid(randomBid);
             st4.setPrice(price);
             System.out.println("The Bid is " + st4.getBid());
             
             System.out.println("The price is " + st4.getPrice());

            Context context = new Context(new BearStrategy());
            int metric = context.getMetric(st4.getBid(), st4.getPrice());
            market.trade(st4, metric);

            System.out.println("The metric is " + metric);
        }
       
        
        System.out.println("\n\n");

        System.out.println("Removing the latest stock");
        market.removeStock();
        System.out.println(market.toString());

    }

    /*
    Removes last Stock
     */
    public void removeStock() {
        List<Stock> list = StockMarket.getInstance().stocks;
        list.remove(list.size() - 1);
    }

    

    @Override
    public String toString() {
        return "StockMarket{" +
                "stocks=" + stocks +
                '}';
    }
}
