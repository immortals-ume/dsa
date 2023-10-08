package com.immortals.ds.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStack {


    public static void main(String[] args) {
        Deque<Integer> doubleEndedStack = new ArrayDeque<>();

        // Push elements onto the stack
        doubleEndedStack.push(1); // Push at the beginning
        doubleEndedStack.push(2);
        doubleEndedStack.push(3);

        // Pop elements from the stack
        int topElement = doubleEndedStack.pop(); // Pop from the beginning
        System.out.println("Top element: " + topElement);
    }


}
