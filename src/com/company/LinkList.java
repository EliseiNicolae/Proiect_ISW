package com.company;

public class LinkList {
    public Link first;
    public Link last;

    public LinkList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

//    public void insertFirst(int I) {
//        Link newLink = new Link(I);
//        newLink.next = first;        // newLink --> old first
//        first = newLink;             // first --> newLink
//    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public int getListItem(int nr) {
        int d = 0;
        Link current = first;
        while (current != null) {
            if (nr == current.keyID) {
                d = current.iData;
            }
            current = current.next;

        }
        return d;
    }

    public void insertLast(int dd) {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }
}
