package edu.neu.csye7374.factory;

import edu.neu.csye7374.InfyStock;
import edu.neu.csye7374.Stock;
import edu.neu.csye7374.factory.AbstractStockFactory;

public class InfyStockFactory implements AbstractStockFactory {

    @Override
    public Stock getObject() {
        return new InfyStock();
    }
}
