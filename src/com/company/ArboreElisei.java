package com.company;

public class ArboreElisei {
    public NodArboreElisei root;

    public ArboreElisei() {
        root = null;
    }

    //    Inserare
    public void insert(int key) {
        NodArboreElisei newNode = new NodArboreElisei();
        newNode.KeyNode = key;
        if (root == null) {
            root = newNode;
        } else {
            NodArboreElisei current = root;
            NodArboreElisei parent;
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
    public String updateRSD(NodArboreElisei x) {
        if (x != null) {
            noduriArbore = noduriArbore + " " + x.getNode();
            updateRSD(x.leftChild);
            updateRSD(x.rightChild);
        }

        return noduriArbore;
    }

    //    Calculare inaltime
    int contorInaltimeLeft = 0;
    int contorInaltimeRight = 0;
    public int inaltimeArbore(NodArboreElisei x) {
        if (x != null) {
            contorInaltimeLeft = inaltimeArbore(x.leftChild);
            contorInaltimeRight = inaltimeArbore(x.rightChild);
            return contorInaltimeLeft > contorInaltimeRight ? contorInaltimeLeft + 1 : contorInaltimeRight + 1;
        }
        return 0;
    }

    //  Inserare numar in locul valorilor nule (0)
    public void inserareVLRN(NodArboreElisei x, int valoareInlocuire){
        if (x != null) {
            inserareVLRN(x.leftChild, valoareInlocuire);
            inserareVLRN(x.rightChild, valoareInlocuire);
            if(x.KeyNode == 0) x.KeyNode = valoareInlocuire;
        }
    }
}
