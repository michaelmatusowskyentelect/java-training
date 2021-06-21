package com.company;

import java.util.LinkedList;

public class MyLinkedList implements NodeList {
    ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public MyLinkedList() {
        super();
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        // Case 1: no items in the list
        if (root == null) {
            root = item;
            return true;
        }
        // Case 2: Only root in the list and item is equal
        else if (root.compareTo(item) == 0) {
            return false;
        } else {
            ListItem current = root;
            while (true) {
                // Case 3: item is bigger than current and next

                if (current.next() != null && current.compareTo(item) < 0 && current.next().compareTo(item) < 0) {
                    current = current.next();
                }
                // case 4: item is bigger than current but next is null
                else if (current.next() == null && current.compareTo(item) < 0) {
                    current.setNext(item);
                    item.setPrevious(current);
                    return true;
                }
                // case 5: item is bigger than current and next is bigger than item
                else if (current.next() != null && current.compareTo(item) < 0 && current.next().compareTo(item) > 0) {
                    item.setPrevious(current);
                    item.setNext(current.next());
                    current.setNext(item);
                    current.next().setPrevious(item);
                    return true;
                }
                // case 6: item is smaller than current and previous
                else if (current.previous() != null && current.compareTo(item) > 0 && current.previous().compareTo(item) > 0) {
                    current = current.previous();
                }
                // case 7: item is smaller than current but previous is null
                else if (current.previous() == null && current.compareTo(item) > 0) {
                    current.setPrevious(item);
                    item.setNext(current);
                    root = item;
                    return true;
                }
                // case 8: item is smaller than current but bigger than previous
                else if (current.previous() != null && current.compareTo(item) > 0 && current.previous().compareTo(item) < 0) {
                    item.setPrevious(current.previous());
                    item.setNext(current);
                    current.previous().setNext(item);
                    current.setPrevious(item);
                    return true;
                } else if (current.compareTo(item) == 0) {
                    return false;
                }
            }
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (root == null)
            return false;
        if (root.next() == null && root.previous() == null) {
            root.setValue(null);
            return true;
        }
        ListItem current = root;
        while (current != null) {
            if (current.compareTo(item) == 0){
                if (current.next() == null && current.previous() != null){
                    current.previous().setNext(null);
                    return true;
                }
                else if (current.next() != null && current.previous() == null){
                    root = current.next();
                    root.setPrevious(null);
                    return true;
                }
                else if (current.next() != null && current.previous() != null){
                    current.next().setPrevious(current.previous());
                    current.previous().setNext(current.next());
                    return true;
                }
            }
            else if (current.compareTo(item) < 0){
                current = current.next();
            }
            else if (current.compareTo(item) > 0){
                current = current.previous();
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null)
            System.out.println("The list is empty");
        ListItem current = root;
        while (current != null){
            System.out.println((String) current.getValue());
            current = current.next();
        }
    }
}
