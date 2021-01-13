package com.company;

import java.util.concurrent.atomic.AtomicInteger;

public class LinkAlin {
    public int iData;
    private static final AtomicInteger count = new AtomicInteger(0);
    public final int keyID;
    public LinkAlin next;

    public LinkAlin(int data) {
        keyID = count.incrementAndGet();
        iData = data;
    }

    public void displayLink() {
        System.out.print(keyID + "//" + iData + " ");
    }
}
