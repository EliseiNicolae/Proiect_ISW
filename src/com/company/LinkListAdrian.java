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

    public void insertLast(int item) {
        LinkAdrian newLink = new LinkAdrian(item);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public LinkAdrian deleteFirst() {
        LinkAdrian temp = first;
        first = first.next;
        return temp;
    }


//    public void displayList() {
//        int nr = 0;
//        LinkAdrian current = first;
//        while (current != null) {
//            current.displayLink();
//            arr[nr] = current.iData;
//            nr++;
//            current = current.next;
//
//        }
//        System.out.println("");
//    }


//    public void populateArr() {
//        arr;
//        int nr = 0;
//        LinkAdrian current = first;
//        while (current != null) {
//            current.displayLink();
//            arr[nr] = current.iData;
//            nr++;
//            current = current.next;
//
//        }
//    }
    int[] arr;
    int nr = 0;
    public int[] getArr() {
//        return arr.clone();
        LinkAdrian current = first;
        while (current != null) {
            ar[nr] = current.iData;
            nr++;
            current = current.next;
        }
        return ar;
    }

//    public int insertResultList(int pos) {
//        LinkAdrian current = first;
//        int b = 0;
//        while (current.keyID != pos) {
//            current = current.next;
//            if (current == null) {
////                System.out.println(current.iData);
////                    current.displayLink();
//                return 0;
//            }
//            b = square(current.iData);
////            current = current.next;
//            return b;
//        }
//            else{
//            current = current.next;
//        }
////            current = current.next;
////            int a = current.getData();
//////
////          if (current != null) {
////              current = current.next;
////              System.out.println(b);
////          }
////            System.out.println(a);
////            current = current.next;
//
//    }
////        System.out.println("");
//       return b;
////}

    // functie ce calculeaza patratul elementului primit in parametrul item
    public int square(int item) {
        return (int) Math.pow(item, 2);
    }

    // functie ce insereaza dupa pozitia primita in parametrul key
    public boolean insertAfter(int key) {
        LinkAdrian current = first;
        while (current.keyID != key) {
            current = current.next;
            if (current == null)
                return false;
        }
        LinkAdrian newLink = new LinkAdrian(square(current.iData));
        if (current == last) {
            newLink.next = null;
            last = newLink;
        } else {
            newLink.next = current.next;
            current.next.previous = newLink;
        }
        newLink.previous = current;
        current.next = newLink;
        return true;
    }
}
