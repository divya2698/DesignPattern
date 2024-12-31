package edu.neu.csye7374;

public class TeslaStockFactoryEager extends AbstractStockFactory {
 //Eager Singleton
	private static final TeslaStockFactoryEager instance =
			 new TeslaStockFactoryEager();
	
			   private TeslaStockFactoryEager() {
			   }
			   
			   public static TeslaStockFactoryEager getInstance() {
			return instance;
			   }
	    
	@Override
	public TeslaStock getObject(String name, double price, String description) {
		// TODO Auto-generated method stub
		return new TeslaStock(name, price, description);
	}
	

}

