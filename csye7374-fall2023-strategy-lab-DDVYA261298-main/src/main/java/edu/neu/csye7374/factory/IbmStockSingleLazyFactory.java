package edu.neu.csye7374.factory;

import edu.neu.csye7374.IbmStock;
import edu.neu.csye7374.Stock;

public class IbmStockSingleLazyFactory implements AbstractStockFactory{

    private static IbmStockSingleLazyFactory instance = null;

    private IbmStockSingleLazyFactory() {
    }

    public static IbmStockSingleLazyFactory getInstance() {
        if(instance == null) {
            instance = new IbmStockSingleLazyFactory();
        }
        return instance;
    }

    @Override
    public Stock getObject() {
        return new IbmStock();
    }
}
