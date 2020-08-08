/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.stack;

/**
 * A class that implements usage.Stack data structure using array.
 *
 * @author piya
 */
public class Stack {

    private final int[] storage = new int[100];
    private int top = -1;

    /**
     * Get top element of the stack.
     *
     * @return top element of the stack.
     */
    public int getTop() {
        return top;
    }

    /**
     * Inserts element at the top of the stack.
     * Throws runtime exception if stack is full
     * 
     * @param element to be inserted into the stack.
     */
    public void push(int element) {
        //if already full, don't push
        if (top == storage.length - 1) {
            throw new RuntimeException("usage.Stack already full");
        }
        top++;
        storage[top] = element;
    }

    /**
     * Returns the top element of the stack without removing it from the stack.
     * Throws runtime exception if stack is empty.
     * 
     * @return top element of the stack
     */
    public int peek() {
        if(top != -1){
            return storage[top];
        }
        return -1;
    }

    /**
     * Removes top element of the stack.
     * Throws runtime exception if stack is empty.
     */
    public void pop() {
        //if empty, don't pop
        if (isEmpty()) {
            throw new RuntimeException("usage.Stack is empty");
        }
        top--;
    }

    /**
     * Check if stack is empty or not.
     *
     * @return true if stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns the size of the stack.
     *
     * @return size of the stack
     */
    public int size() {
        int i = top;
        int count = 0;
        while (i >= 0) {
            count++;
            i--;
        }
        return count;
    }

    /**
     * Returns a string representation of the stack.
     * 
     * @return a string representation of the stack.
     */
    @Override
    public String toString() {
        String result = "usage.Stack: ";
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
