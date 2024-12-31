package edu.neu.csye7374;

import java.util.concurrent.ThreadLocalRandom;

public class IBMStock extends Stock{

	    public IBMStock(String name, double price, String description) {
	        super(name, price, description);
	    }
		public void setPrice(double price) {
			super.setPrice(price);
    	}

	    @Override
	    public void setBid(double bid) {
	        super.setBid(bid);
	        
	    }

	    @Override
	    public int getMetric() {
	        int num = (ThreadLocalRandom.current().nextInt(-40, 40 + 1)*5)/4;
		return num;
	    }

}
