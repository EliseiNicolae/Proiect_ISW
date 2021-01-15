package com.company;

public class LinkListAlin {
    public LinkAlin first;
    public LinkAlin last;

    public LinkListAlin() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int I) {
        LinkAlin newLink = new LinkAlin(I);
        newLink.next = first;
        first = newLink;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        LinkAlin current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public int getListItem(int nr) {
        int d = 0;
        LinkAlin current = first;
        while (current != null) {
            if (nr == current.keyID) {
                d = current.iData;
            }
            current = current.next;
        }
        return d;
    }

    public void insertLast(int dd) {
        LinkAlin newLink = new LinkAlin(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }
}
