package edu.neu.csye7374;

import java.util.Random;

public class BearStrategy  implements StockStrategy{

    @Override
     public int getMetric(double bid, double price) {
        // TODO Auto-generated method stub
        Random random = new Random();
       
        int result = random.nextInt(2);
        return result == 0 ? -1 : 1;
    }
    
}
