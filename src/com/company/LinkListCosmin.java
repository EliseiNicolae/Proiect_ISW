package com.company;

import java.util.ArrayList;

public class LinkListCosmin {
    public LinkCosmin first;

    // aici vom stoca cheile negative din lista
    ArrayList<Integer> resultArray = new ArrayList<>(1);

    public LinkListCosmin() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int I) {
        LinkCosmin newLink = new LinkCosmin(I);
        newLink.next = first;
        first = newLink;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        LinkCosmin current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    public void deletePositive() {
        LinkCosmin current = first;
        LinkCosmin previous = first;
        while (current != null) {
            if (current.iData < 0) {
                previous = current;
                resultArray.add(current.iData);
                System.out.println(current.iData);
                current = current.next;
            }
            if (current == first) {
                first = first.next;
            } else {
                previous.next = current.next;
            }
            current = current.next;
        }
        System.out.println("");
    }

    public ArrayList<Integer> getResultArray() {
        return (ArrayList<Integer>) resultArray.clone();
    }
}
