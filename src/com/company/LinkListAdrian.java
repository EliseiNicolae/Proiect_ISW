package com.company;

public class LinkListAdrian {
    public LinkAdrian first;
    public LinkAdrian last;
    public static int[] ar;

    public LinkListAdrian() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int I) {
        LinkAdrian newLink = new LinkAdrian(I);
        newLink.next = first;
        first = newLink;
    }

    public int deleteFirst() {
        LinkAdrian temp = first;
        int Lastelement = temp.iData;
        first = first.next;
        return Lastelement;
    }


    public int[] getList(int numberOfElements) {
        int[] numbersList = new int[numberOfElements];
        int contorList = 0;
        LinkAdrian current = first;
        while (current != null) {
            numbersList[contorList] = current.getData();
            current = current.next;
            contorList++;
        }
        return numbersList;
    }

}