package edu.neu.csye7374.Factories;

import edu.neu.csye7374.Strategies.StockStrategyAPI;

public abstract class StrategyFactory {
    public abstract StockStrategyAPI createStrategy();
}
