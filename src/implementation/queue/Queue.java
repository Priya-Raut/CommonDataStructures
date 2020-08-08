/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.queue;

/**
 * A class which implements usage.Queue data structure with an array.
 *
 * @author piya
 */
public class Queue {

    private final int[] storage = new int[5];
    private int head = -1;
    private int tail = -1;

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }

    /**
     * Insert element into usage.Queue from tail.
     *
     * @param element to be inserted into usage.Queue.
     */
    public void enqueue(int element) {
        if (tail == storage.length - 1) {
            throw new RuntimeException("usage.Queue is full");
        }
        if (isEmpty()) {
            head++;
            tail++;
            storage[head] = element;
        } else {
            tail++;
            storage[tail] = element;
        }
    }

    /**
     * Removes element from head of the usage.Queue.
     *
     * @return removed element
     */
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Empty usage.Queue.");
        }
        int element = storage[head];
        head++;
        return element;
    }

    /**
     * Returns head element of the usage.Queue.
     *
     * @return head element of the usage.Queue
     */
    public int peek() {
        if(head != -1){
            return storage[head];
        }
        return -1;
    }

    /**
     * Returns size of the usage.Queue.
     *
     * @return size of the usage.Queue
     */
    public int size() {
        int count = 0;
        for (int i = head; i <= tail; i++) {
            count++;
        }
        return count;
    }

    /**
     * Checks if usage.Queue is empty or not.
     *
     * @return true if usage.Queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return (head > tail) //final state when all elements are dequeued
                || (head == -1 && tail == -1); //initial state when no elements is enqueued
    }

    /**
     * Returns a String representation of the usage.Queue.
     *
     * @return a String representation of the usage.Queue.
     */
    @Override
    public String toString() {
        String result = "";
        for (int i = head; i <= tail; i++) {
            result += storage[i] + " ";
        }
        return "usage.Queue: " + result;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        // throws runtime exception
        // queue.enqueue(6);
        System.out.println("Head: " + queue.head);
        System.out.println("Tail: " + queue.tail);
        System.out.println(queue);
        System.out.println("Peeked element: " + queue.peek());

        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Removed element: " + queue.dequeue());
        // throws runtime exception
        // System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Head: " + queue.head);
        System.out.println("Tail: " + queue.tail);
        System.out.println("Is Empty: " + queue.isEmpty());
        System.out.println("Size: " + queue.size());

    }
}
