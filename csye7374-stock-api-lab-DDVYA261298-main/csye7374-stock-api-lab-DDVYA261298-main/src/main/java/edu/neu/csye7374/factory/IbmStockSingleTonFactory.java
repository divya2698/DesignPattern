package edu.neu.csye7374.factory;

import edu.neu.csye7374.IbmStock;
import edu.neu.csye7374.Stock;

public class IbmStockSingleTonFactory implements AbstractStockFactory{

    private static IbmStockSingleTonFactory instance = null;

    private IbmStockSingleTonFactory() {
    }

    public static IbmStockSingleTonFactory getInstance() {
        if(instance == null) {
            instance = new IbmStockSingleTonFactory();
        }
        return instance;
    }

    @Override
    public Stock getObject() {
        return new IbmStock();
    }
}
