package com.company;

public class LinkDavid {
    public int iData;
    public LinkDavid next;

    public LinkDavid(int data) {
        iData = data;
    }

    public void displayLink() {
        System.out.print(iData + " ");
    }
}
