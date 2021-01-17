package com.company;

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

    // Functie Print

     int printArbore(NodArboreMarian node, int k1, int k2) {


        /* base case */
        if (node == null) {
            return 0;
        }

        /* Since the desired o/p is sorted, recurse for left subtree first
         If root->data is greater than k1, then only we can get o/p keys
         in left subtree */
        if (k1 < node.KeyNode) {
            printArbore(node.leftChild,k1 , k2);
        }

        /* if root's data lies in range, then prints root's data */
        if (k1 <= node.KeyNode && k2 >= node.KeyNode) {
            System.out.print(node.KeyNode + " ");
        }

        /* If root->data is smaller than k2, then only we
         can get o/p keys in right subtree */
        if (k2 > node.KeyNode) {
            printArbore(node.rightChild, k1 , k2);
        }


         return 0;
     }

     //Functie Count

      int  getCount(NodArboreMarian node , int low , int high) {

        // Base Case
        if(node == null)
            return 0;

        // If current node is in range, then
        // include it in count and recur for
        // left and right children of it
        if(node.KeyNode >= low && node.KeyNode <= high)
            return 1 + this.getCount(node.leftChild, low, high)+ this.getCount(node.rightChild, low, high);

            // If current node is smaller than low,
            // then recur for right child
        else if(node.KeyNode < low)
            return this.getCount(node.rightChild, low, high);

            // Else recur for left child
        else
            return this.getCount(node.leftChild, low, high);

    }



}
