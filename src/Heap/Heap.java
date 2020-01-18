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
    private int curentPosition = -1;

    public Heap(int size) {
        this.heapData = new int[size];
    }

    public int[] getHeapData() {
        return heapData;
    }

    /**
     * Insert operation in the heap. First insert node at the end of heapData.
     * If new node is greater than its parent, fix the heap upwards.
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
            fixUp(heapData, curentPosition);
            System.out.println("Heap after fixing: " + Arrays.toString(heapData));
        }
    }

    public void delete(int key) {

    }

    /**
     * Fix heap by moving nodes with bigger values than parent upwards in heap
     * levels.
     *
     * @param heapData array where some elements does not follow heap
     * properties.
     * @param curentPosition current position in the heap.
     * @return an array which follows heap properties.
     */
    public int[] fixUp(int[] heapData, int curentPosition) {
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
     *
     * @param heapData
     * @param limit
     * @return
     */
    public int[] fixDown(int[] heapData, int limit) {
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
    }
}
