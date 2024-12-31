package edu.neu.csye7374.stockApi;

public class IBM extends Stock{

    private static Stock instance;

    private double bid;
    private IBM() {}

    public static Stock getInstance() {

        if(instance == null) {
            synchronized (IBM.class) {
                if(instance == null) {
                    instance = new IBM();
                }
            }
        }

        return instance;
    }

    @Override
    public void setBid(double bid) {
        this.bid = bid;
    }

    @Override
    public int getMetric() {
        return (int)bid+5;
    }
}
