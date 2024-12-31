package edu.neu.csye7374;

import java.util.concurrent.ThreadLocalRandom;

public class TeslaStock extends Stock{

	    public TeslaStock(String name, double price, String description) {
	        super(name, price, description);
	    }

		public void setPrice(double price) {
			super.setPrice(price);
    	}

	    @Override
	    public void setBid(double bid) {
	        super.setBid(bid);
	        // this.setPrice(this.getMetric()/3 + 1);
	    }

	    @Override
	    public int getMetric() {
	        int num = (ThreadLocalRandom.current().nextInt(-40, 40 + 1)*6)/4;
		return num;
	    }

}
