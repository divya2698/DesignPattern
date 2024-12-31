package edu.neu.csye7374;

public class StockA extends  StockAPI implements Tradable{
    private int metric;

    public StockA(String ID, double price, String description) {
        super(ID, price, description);
        metric = 0;
    }

    @Override
    public void setBid(double bid) {
        // Simulate market trends by changing the stock price
        setPrice(getPrice() + bid);
    }

    @Override
    public int getMetric() {
        // Implement your own metric calculation algorithm here
        // This is just a placeholder example
        metric = (int) (getPrice() - 100); // Example metric calculation
        return metric;
    }
}
