package edu.neu.csye7374.Factories;

import edu.neu.csye7374.Strategies.BearMarketStrategy;
import edu.neu.csye7374.Strategies.StockStrategyAPI;

public class EagerBearMarketSingletonFactory extends StrategyFactory {
    private static final EagerBearMarketSingletonFactory instance = new EagerBearMarketSingletonFactory();

    private EagerBearMarketSingletonFactory() {
        // private constructor to prevent instantiation
    }

    public static EagerBearMarketSingletonFactory getInstance() {
        return instance;
    }

    @Override
    public StockStrategyAPI createStrategy() {
        return new BearMarketStrategy();
    }
}
