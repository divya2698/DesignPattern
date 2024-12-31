package edu.neu.csye7374.Factories;

import edu.neu.csye7374.Strategies.BearMarketStrategy;
import edu.neu.csye7374.Strategies.StockStrategyAPI;

public class LazyBearMarketSingletonFactory extends StrategyFactory {
    private static LazyBearMarketSingletonFactory instance;

    private LazyBearMarketSingletonFactory() {
        // private constructor to prevent instantiation
    }

    public static synchronized LazyBearMarketSingletonFactory getInstance() {
        if (instance == null) {
            instance = new LazyBearMarketSingletonFactory();
        }
        return instance;
    }

    @Override
    public StockStrategyAPI createStrategy() {
        return new BearMarketStrategy();
    }
}