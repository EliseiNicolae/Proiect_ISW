package com.company;

import java.util.concurrent.atomic.AtomicInteger;

//Se dă o listă de forma l1: x1 y1 → x2 y2 →... → xn yn /, unde yi=f(xi), iar f este o functie oarecare la alegere. Se cere să se construiască o a doua listă de forma l2: y1 x1 → y2 x2 →... → yn xn /
//        f(xi) = xi*2
//        deci yi = xi*2
//        Exemplu de lista 1:
//        l1 : 1 2 2 4 3 6
//        Exemplu de lista 2:
//        l2: 2 1 4 2 6 3

public class LinkAdrian {
    public int iData;
    public LinkAdrian next;
    private static final AtomicInteger count = new AtomicInteger(0);
    public final int keyID;

    public LinkAdrian(int I) {
        keyID = count.incrementAndGet();
        iData = I;
    }

    public int getData() {
        return iData;
    }
}