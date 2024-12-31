package edu.neu.csye7374;


public class BullStrategy implements StockStrategy{
    
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
