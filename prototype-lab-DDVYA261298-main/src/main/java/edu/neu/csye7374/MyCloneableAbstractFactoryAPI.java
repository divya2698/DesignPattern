package edu.neu.csye7374;

import java.util.HashMap;

public abstract class MyCloneableAbstractFactoryAPI {
    public abstract void load(int id, MyCloneable prototype);
    public abstract void load(HashMap<Integer, MyCloneable> prototypeList);
    public abstract MyCloneable getObject(int id);
}