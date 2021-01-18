package com.company;

public class NodArboreMarian {
    public int KeyNode;
    public NodArboreMarian leftChild;
    public NodArboreMarian rightChild;

    public void displayNode(){
        System.out.println(KeyNode + " ");
    }
    public int getNode(){
        return KeyNode;
    }
}
