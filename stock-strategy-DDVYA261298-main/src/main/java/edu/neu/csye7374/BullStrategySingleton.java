package edu.neu.csye7374;

public class BullStrategySingleton implements StockStrategy{
    
    private static BullStrategySingleton instance;

	private BullStrategySingleton() {
        instance = null;
    }

	public static synchronized BullStrategySingleton getInstance() {
		if (instance == null) {

			instance = new BullStrategySingleton();
		}
		return instance;
	}

     @Override
    public int getMetric(double bid, double price) {
        int res;
       if(bid < price){
        return  res = -1;
        } else if(bid > price){
            return res = 1;
        } else {
            return res= 0;
        }
}
}
