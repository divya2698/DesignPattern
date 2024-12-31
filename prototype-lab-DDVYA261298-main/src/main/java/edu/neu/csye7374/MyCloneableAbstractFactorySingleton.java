package edu.neu.csye7374;

import java.util.HashMap;

/**
 * Develop MyCloneableAbstractFactorySingleton
 */
class MyCloneableAbstractFactorySingleton {
    private static MyCloneableAbstractFactorySingleton instance;
    private MyCloneableAbstractFactory factory;

    private MyCloneableAbstractFactorySingleton() {
        factory = new MyCloneableAbstractFactory();
    }

    public static synchronized MyCloneableAbstractFactorySingleton getInstance() {
        if (instance == null) {
            instance = new MyCloneableAbstractFactorySingleton();
        }
        return instance;
    }

    public void load(int id, MyCloneable prototype) { factory.load(id, prototype); }
    public void load(HashMap<Integer, MyCloneable> prototypes) {
        factory.load(prototypes);
    }

    public MyCloneable getObject(int id) {
        return factory.getObject(id);
    }
}
