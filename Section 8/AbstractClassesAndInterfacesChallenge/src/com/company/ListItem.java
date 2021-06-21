package com.company;

public abstract class ListItem {

    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;

    public ListItem(Object value){
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem previous();
    abstract ListItem setNext(ListItem next);
    abstract ListItem setPrevious(ListItem previous);
    abstract int compareTo(ListItem item);
    Object getValue(){
        return value;
    }
    void setValue(Object value){
        this.value = value;
    }
}
