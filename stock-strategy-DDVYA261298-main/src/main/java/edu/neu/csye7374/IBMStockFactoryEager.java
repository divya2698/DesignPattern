
package edu.neu.csye7374;


public class IBMStockFactoryEager extends AbstractStockFactory {
	
	 //Eager Singleton
	private static final IBMStockFactoryEager instance =
			 new IBMStockFactoryEager();
	
			   private IBMStockFactoryEager() {
			   }
			   
			   public static IBMStockFactoryEager getInstance() {
			return instance;
			   }
	    
	@Override
	public IBMStock getObject(String name, double price, String description) {
		// TODO Auto-generated method stub
		return new IBMStock(name, price, description);
	}
	
	
}
