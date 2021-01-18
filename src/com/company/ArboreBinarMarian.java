package com.company;

import java.util.Arrays;

public class ArboreBinarMarian {
    public NodArboreMarian root;

    public ArboreBinarMarian() {
        root = null;
    }

    // Cautare
    public NodArboreMarian find(int key) {
        NodArboreMarian current = root;
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
    public void insertValue(int key) {
        NodArboreMarian newNode = new NodArboreMarian();
        newNode.KeyNode = key;
        if (root == null) {
            root = newNode;
        } else {
            NodArboreMarian current = root;
            NodArboreMarian parent;
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

    public String updateRSD(NodArboreMarian x) {
        if (x != null) {
            noduriArbore = noduriArbore + " " + x.getNode();
            updateRSD(x.leftChild);
            updateRSD(x.rightChild);
        }

        return noduriArbore;
    }

    //    Parcurgere SDR
    public void SDR(NodArboreMarian x) {
        if (x != null) {
            SDR(x.leftChild);
            SDR(x.rightChild);
            x.displayNode();
        }
    }

    //    Parcurgere SRD
    public void SRD(NodArboreMarian x) {
        if (x != null) {
            SRD(x.leftChild);
            x.displayNode();
            SRD(x.rightChild);
        }
    }

    int contorElemente = 0;

    public int getCont(NodArboreMarian node, int k1, int k2) {
        /* base case */
        if (node != null) {
            if (k1 < node.KeyNode) {
                getCont(node.leftChild, k1, k2);
            }
            if (node.KeyNode >= k1 && node.KeyNode <= k2) {
                contorElemente++;
            }
            if (k2 > node.KeyNode) {
                getCont(node.rightChild, k1, k2);
            }
        }
        return contorElemente;
    }

    int contLista = 0;
    int[] numbersList = new int[100];

    boolean onlyOne = true;
    int[] getIntervalThree(NodArboreMarian node, int k1, int k2) {
        /* base case */
        if (node != null) {
            if (k1 < node.KeyNode) {
                getIntervalThree(node.leftChild, k1, k2);
            }
            if (k1 <= node.KeyNode && node.KeyNode <= k2) {
                numbersList[contLista++] = node.KeyNode;
            }
            if (k2 > node.KeyNode) {
                getIntervalThree(node.rightChild, k1, k2);

            }
        }
        return numbersList;
    }
}