/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heap;

import java.util.Arrays;

/**
 * A class that represents heap data structure. Heap is a complete binary tree
 * (except in leaf nodes) with parent nodes having higher values than children
 * nodes.
 *
 * @author piya
 */
public class Heap {

    private int[] heapData;
    private static int curentPosition = -1;

    public Heap(int size) {
        this.heapData = new int[size];
    }

    public int[] getHeapData() {
        return heapData;
    }

    /**
     * Insert new node in the heap. First insert node at the end of heapData. If
     * new node is greater than its parent, fix the heap upwards.
     *
     * @param key to be inserted into heap
     */
    public void insert(int key) {
        if (isFull()) {
            throw new RuntimeException("Heap is full");
        }
        curentPosition++;
        heapData[curentPosition] = key;
        System.out.println("Heap before fixing: " + Arrays.toString(heapData));
        if (curentPosition > 0) {
            fixUp(heapData);
            System.out.println("Heap after fixing: " + Arrays.toString(heapData));
        }
    }

    /**
     * Delete a key from the heap.
     *
     * @param key to be deleted from the heap.
     */
    public void delete(int key) {
        int deleteIndex = -1;
        //Find the key to be deleted
        for (int i = 0; i < heapData.length; i++) {
            if (key == heapData[i]) {
                deleteIndex = i;
            }
        }
        if (deleteIndex >= 0) {
            System.out.println("Key to be deleted is found at: " + deleteIndex);
        } else {
            System.out.println("Key to be deleted is NOT found: ");
            return;
        }
        //Put heapData[curentPosition] in heapData[deleteIndex]
        System.out.println("curentPosition: " + curentPosition);
        heapData[deleteIndex] = heapData[curentPosition];
        heapData[curentPosition--] = 0;
        System.out.println("Heap after deleting element: " + Arrays.toString(heapData));
        System.out.println("curentPosition: " + curentPosition);
        //Fix the heap, since smaller node than parent is present in heap
        fixDown(heapData);
        System.out.println("Heap after fixing: " + Arrays.toString(heapData));
    }

    /**
     * Fix heap by moving nodes with bigger values than parent upwards in heap
     * levels.
     *
     * @param heapData array where some elements does not follow heap
     * properties.
     * @return an array which follows heap properties.
     */
    public int[] fixUp(int[] heapData) {
        int i = curentPosition;
        int childIndex = i;
        int parentIndex = (i - 1) / 2;
        int temp;
        while (i > 0) {
            System.out.println("childIndex: " + childIndex + " parentIndex: " + parentIndex);
            if (heapData[parentIndex] < heapData[childIndex]) {
                temp = heapData[parentIndex];
                heapData[parentIndex] = heapData[childIndex];
                heapData[childIndex] = temp;
            }
            i--;
            childIndex = i;
            parentIndex = (i - 1) / 2;
        }
        return heapData;
    }

    /**
     * Fix heap by moving invalid key down in the levels of heap
     *
     * @param heapData heap to be fixed
     * @return fixed heap
     */
    public int[] fixDown(int[] heapData) {
        int i = 0;
        int parentIndex = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;
        int temp = 0;
        int largerIndex = 0;

        while (i<=curentPosition) {
            if (leftIndex <= curentPosition && rightIndex <= curentPosition) {
                largerIndex = (heapData[leftIndex] > heapData[rightIndex]) ? leftIndex : rightIndex;
            } else if (leftIndex <= curentPosition && rightIndex > curentPosition) {

            } else if (leftIndex > curentPosition && rightIndex > curentPosition) {
                break;
            }
            if (heapData[parentIndex] < heapData[largerIndex]) {
                temp = heapData[parentIndex];
                heapData[parentIndex] = heapData[largerIndex];
                heapData[largerIndex] = temp;
            }
            i++;
            parentIndex = i;
            leftIndex = 2 * i + 1;
            rightIndex = 2 * i + 2;
            System.out.println("Immediate fix: " + Arrays.toString(heapData));
        }
        return heapData;
    }

    /**
     * Returns if heap is full or not.
     *
     * @return true if heap is full, false otherwise.
     */
    public boolean isFull() {
        return curentPosition == heapData.length - 1;
    }

    public static void main(String[] args) {
        Heap heap = new Heap(8);
        heap.insert(25);
        heap.insert(30);
        heap.insert(40);
        heap.insert(35);
        heap.insert(50);
        heap.insert(45);
        heap.insert(65);
        heap.insert(5);
//      Throws runtime exception            
//      heap.insert(10);
        System.out.println("Heap data: " + Arrays.toString(heap.getHeapData()));
        heap.delete(50);
        heap.delete(65);
    }
}
