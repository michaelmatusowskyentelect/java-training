package com.company;

public class SearchTree implements NodeList{

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
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
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
