package edu.neu.csye7374;

import java.util.HashMap;

/**
 * Develop MyCloneableAbstractFactory from the supplied MyCloneableAbstractFactoryAPI
 */
class MyCloneableAbstractFactory extends MyCloneableAbstractFactoryAPI {
    private HashMap<Integer, MyCloneable> prototypes;

    public MyCloneableAbstractFactory() {
        prototypes = new HashMap<>();
    }

    @Override
    public void load(int id, MyCloneable prototype) {
        prototypes.put(id, prototype);
    }

    @Override
    public void load(HashMap<Integer, MyCloneable> prototypeList) {
        prototypes.putAll(prototypeList);
    }

    @Override
    public MyCloneable getObject(int id) {
        MyCloneable prototype = prototypes.get(id);
        if (prototype != null) {
            try {
                return prototype.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}

