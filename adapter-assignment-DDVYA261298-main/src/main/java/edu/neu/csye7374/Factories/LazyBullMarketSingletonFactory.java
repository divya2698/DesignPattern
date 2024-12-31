package edu.neu.csye7374.Factories;

import edu.neu.csye7374.Strategies.BullMarketStrategy;
import edu.neu.csye7374.Strategies.StockStrategyAPI;

public class LazyBullMarketSingletonFactory extends StrategyFactory {
    private static LazyBullMarketSingletonFactory instance;

    private LazyBullMarketSingletonFactory() {
        // private constructor to prevent instantiation
    }

    public static synchronized LazyBullMarketSingletonFactory getInstance() {
        if (instance == null) {
            instance = new LazyBullMarketSingletonFactory();
        }
        return instance;
    }

    @Override
    public StockStrategyAPI createStrategy() {
        return new BullMarketStrategy();
    }
}