/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import com.sun.org.apache.xml.internal.security.keys.storage.StorageResolver;

/**
 * A class that implements Stack data structure using array.
 *
 * @author piya
 */
public class Stack {

    private final int[] storage = new int[5];
    private int top = -1;

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void push(int element) {
        //if already full, don't push
        if (top == storage.length - 1) {
            throw new RuntimeException("Stack already full");
        }
        top++;
        storage[top] = element;
    }

    public int peek() {
        return storage[top];
    }

    public void pop() {
        //if empty, don't pop
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        top--;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        int i = top;
        int count = 0;
        while (i >= 0) {
            count++;
            i--;
        }
        return count;
    }

    @Override
    public String toString() {
        String result = "Stack: ";
        int i = top;
        while (i >= 0) {
            result += storage[i] + " ";
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        // throws runtime exception
        // stack.push(6);
        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        // throws runtime exception
        // stack.pop();

        System.out.println(stack);
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
    }

}
