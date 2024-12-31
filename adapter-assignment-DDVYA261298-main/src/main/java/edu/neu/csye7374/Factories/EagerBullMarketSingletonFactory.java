package edu.neu.csye7374.Factories;

import edu.neu.csye7374.Strategies.BullMarketStrategy;
import edu.neu.csye7374.Strategies.StockStrategyAPI;

public class EagerBullMarketSingletonFactory extends StrategyFactory {
    private static final EagerBullMarketSingletonFactory instance = new EagerBullMarketSingletonFactory();

    private EagerBullMarketSingletonFactory() {
        // private constructor to prevent instantiation
    }

    public static EagerBullMarketSingletonFactory getInstance() {
        return instance;
    }

    @Override
    public StockStrategyAPI createStrategy() {
        return new BullMarketStrategy();
    }
}