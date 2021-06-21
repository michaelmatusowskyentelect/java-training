package com.company;

public class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    ListItem next() {
        return rightLink;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setNext(ListItem next) {
        rightLink = next;
        return rightLink;
    }

    @Override
    ListItem setPrevious(ListItem previous) {
        leftLink = previous;
        return leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        return -1;
    }

    @Override
    Object getValue() {
        return value;
    }

    @Override
    void setValue(Object value) {
        this.value = value;
    }
}
