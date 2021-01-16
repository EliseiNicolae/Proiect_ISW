package com.company;

public class NodArboreElisei {
    public int KeyNode;
    public NodArboreElisei leftChild;
    public NodArboreElisei rightChild;

    public void displayNode(){
        System.out.println(KeyNode + " ");
    }
    public int getNode(){
        return KeyNode;
    }
}
