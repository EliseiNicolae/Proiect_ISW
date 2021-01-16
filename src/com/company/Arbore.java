package com.company;

public class Arbore {
    public NodArbore root;

    public Arbore() {
        root = null;
    }

    //    Inserare
    public void insert(int key) {
        NodArbore newNode = new NodArbore();
        newNode.KeyNode = key;
        if (root == null) {
            root = newNode;
        } else {
            NodArbore current = root;
            NodArbore parent;
            while (true) {
                parent = current;
                if (key < current.KeyNode) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    //    Parcurgere RSD
    String noduriArbore = "";
    public String updateRSD(NodArbore x) {
        if (x != null) {
            noduriArbore = noduriArbore + " " + x.getNode();
            updateRSD(x.leftChild);
            updateRSD(x.rightChild);
        }

        return noduriArbore;
    }

    //    Calculare inaltime
    int contorInaltime = 0;
    public int inaltimeArbore(NodArbore x) {
        if (x != null) {
            contorInaltime++;
            inaltimeArbore(x.leftChild);
            inaltimeArbore(x.rightChild);
        }
        return contorInaltime;
    }

    //  Inserare numar in locul valorilor nule (0)
    public void inserareVLRN(NodArbore x, int valoareInlocuire){
        if (x != null) {
            inserareVLRN(x.leftChild, valoareInlocuire);
            inserareVLRN(x.rightChild, valoareInlocuire);
            if(x.KeyNode == 0) x.KeyNode = valoareInlocuire;
        }
    }
}
