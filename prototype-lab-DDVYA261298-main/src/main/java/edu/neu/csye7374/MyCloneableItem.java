package edu.neu.csye7374;

/**
 * Derive MyCloneableItem class from MyCloneable class
 */
class MyCloneableItem extends MyCloneable {
    private MyCloneableItem(Builder builder) {
        super(builder);
    }

    public static class Builder extends MyCloneable.Builder {
        // Additional properties specific to MyCloneableItem
    }
}
