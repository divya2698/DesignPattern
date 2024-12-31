package edu.neu.csye7374;


public class IBMStockFactoryLazy extends AbstractStockFactory {
	
	//Lazy Singleton
	private static IBMStockFactoryLazy instance;
	private static IBMStock StockInstance;

    
	 private IBMStockFactoryLazy(){
	        instance = null;
	        StockInstance = null;
	    };
	    public static synchronized IBMStockFactoryLazy getInstance(){
	        if (instance == null) {
	            instance =  new IBMStockFactoryLazy();
	        }
	        return instance;
	    }

	@Override
	public synchronized IBMStock getObject(String name, double price, String description) {
		// TODO Auto-generated method stub
		if (StockInstance == null) {
			StockInstance =  new IBMStock(name, price, description);
        }
        return StockInstance;
		
	}
	
}
