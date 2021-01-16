package com.company;

public class StackAndrei {
    private int maxSize;
    private int[] stackArray;
    private int top;


    public StackAndrei(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }


    public void push(int j) {
        stackArray[++top] = j;
    }


    public int pop() {
        return stackArray[top--];
    }


    public double peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
