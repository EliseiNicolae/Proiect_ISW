package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Link {
    public int iData;
    private static final AtomicInteger count = new AtomicInteger(0);
    public final int keyID;
    public Link next;

    public Link(int data) {
        keyID = count.incrementAndGet();
        iData = data;
    }

    public void displayLink() {
        System.out.print(keyID + "//" + iData + " ");
    }
}


