package edu.neu.csye7374;

import java.util.Random;

public class BearStrategySingleton implements StockStrategy{
    
private static final BearStrategySingleton instance =
			 new BearStrategySingleton();
	
			   private BearStrategySingleton() {
			   }
			   
			   public static BearStrategySingleton getInstance() {
			return instance;
			   }
               
     @Override
    public int getMetric(double bid, double price) {
        // TODO Auto-generated method stub
       Random random = new Random();
       
        int result = random.nextInt(2);
        return result == 0 ? -1 : 1;
    }
}
