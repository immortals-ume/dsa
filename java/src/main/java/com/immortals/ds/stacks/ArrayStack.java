package com.immortals.ds.stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] stack;
    private int top;

    public ArrayStack() {
        stack = new Object[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(T item) {
        if (top == stack.length - 1) {
            // Stack is full, resize the array
            int newCapacity = stack.length * 2;
            stack = Arrays.copyOf(stack, newCapacity);
        }
        stack[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = (T) stack[top];
        stack[top--] = null; // Remove the reference to the popped item
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
