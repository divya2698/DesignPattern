package edu.neu.csye7374.factory;

import edu.neu.csye7374.IbmStock;
import edu.neu.csye7374.Stock;
import edu.neu.csye7374.factory.AbstractStockFactory;

public class IbmStockFactory implements AbstractStockFactory {

    @Override
    public Stock getObject() {
        return new IbmStock();
    }
}
