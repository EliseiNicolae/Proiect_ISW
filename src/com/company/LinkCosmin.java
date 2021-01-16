package com.company;

public class LinkCosmin {
    public int iData;
    public LinkCosmin next;

    public LinkCosmin(int data) {
        iData = data;
    }

    public void displayLink() {
        System.out.print(iData + " ");
    }
}
