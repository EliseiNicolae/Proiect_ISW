package com.company;

public class Arbore {
    public NodArbore root;

    public Arbore() {
        root = null;
    }

    // Cautare
    public NodArbore find(int key) {
        NodArbore current = root;
        while (current.KeyNode != key) {
            if (key < current.KeyNode) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
            if (current == null) {
                return null;
            }
        }
        return current;
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
    public void RSD(NodArbore x) {
        if (x != null) {
            x.displayNode();
            RSD(x.leftChild);
            RSD(x.rightChild);
        }
    }

    //    Parcurgere SDR
    public void SDR(NodArbore x) {
        if (x != null) {
            SDR(x.leftChild);
            SDR(x.rightChild);
            x.displayNode();
        }
    }

    //    Parcurgere SRD
    public void SRD(NodArbore x) {
        if (x != null) {
            SRD(x.leftChild);
            x.displayNode();
            SRD(x.rightChild);
        }
    }

    //    Calculare inaltime
    int contor = 0;

    public int inaltimeArbore(NodArbore x) {
        if (x != null) {
            contor++;
            inaltimeArbore(x.leftChild);
            inaltimeArbore(x.rightChild);
        }
        return contor;
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
