package com.company;

import java.util.ArrayList;

public class LinkListDavid {
    public LinkDavid first;

    public LinkListDavid() {
        first = null;
    }

    // functia de inserare la inceputul listei
    public void insertFirst(int I) {
        LinkDavid newLink = new LinkDavid(I);
        newLink.next = first;
        first = newLink;
    }

    // functia de afisare a listei
    public void displayList() {
        System.out.print("List (first-->last): ");
        LinkDavid current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }


    // aici vom stoca elementele inversate din lista
    ArrayList<Integer> reversedListArray = new ArrayList<>(1);

    // functia de inversare a listei
    public void reverseLinkedList(LinkListDavid linkedList) {
        LinkDavid previous = null;
        LinkDavid current = linkedList.first;
        LinkDavid next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            reversedListArray.add(current.iData);
            current = next;
        }
        linkedList.first = previous;
    }

    // functie ce returneaza reversedListArray
    public ArrayList<Integer> getResultArray() {
        return (ArrayList<Integer>) reversedListArray.clone();
    }
}
