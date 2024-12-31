package edu.neu.csye7374;

public class TeslaStockFactoryLazy extends AbstractStockFactory {

 private static TeslaStockFactoryLazy instance;
	private static TeslaStock StockInstance;

    
	 private TeslaStockFactoryLazy(){
	        instance = null;
	        StockInstance = null;
	    };
	    public static synchronized TeslaStockFactoryLazy getInstance(){
	        if (instance == null) {
	            instance =  new TeslaStockFactoryLazy();
	        }
	        return instance;
	    }

	@Override
	public synchronized TeslaStock getObject(String name, double price, String description) {
		// TODO Auto-generated method stub
		if (StockInstance == null) {
			StockInstance =  new TeslaStock(name, price, description);
        }
        return StockInstance;
		
	}
}

