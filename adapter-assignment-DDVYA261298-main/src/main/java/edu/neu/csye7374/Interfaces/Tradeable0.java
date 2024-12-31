package edu.neu.csye7374.Interfaces;

public interface Tradeable0 extends Tradable {

    default void setBid(double bid) {
        setBid(bid);
    }

    default int getMetric() {
        return getMetric();
    }

}
