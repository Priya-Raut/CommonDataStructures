/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usage.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Merge two sorted arrays of different length
 * 
 * @author piya
 */
public class MergeSortedArrays {
    /**
     * Accept an integer array input from user
     *
     * @return anArray input from user
     */
    public static int[] getIntegerArray(int size) {
        int[] anArray = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer array elements: ");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = sc.nextInt();
        }
        System.out.println("Input array: " + Arrays.toString(anArray));
        return anArray;
    }
    
    public static void sortArray(int[] anArray){
        Arrays.sort(anArray);
        System.out.println("Sorted usage.Array: " + Arrays.toString(anArray));
    }
    
    public static void main(String[] args) {
        int[] array_1 = getIntegerArray(5);
        sortArray(array_1);
        int[] array_2 = getIntegerArray(3);
        sortArray(array_2);
        int[] mergedArray = new int[array_1.length + array_2.length];
        //merge two arrays of different length
        System.arraycopy(array_1, 0, mergedArray, 0, array_1.length);
        System.arraycopy(array_2, 0, mergedArray, array_1.length, array_2.length);
        System.out.println("Merged usage.Array: " + Arrays.toString(mergedArray));
        //sort the merged array
        sortArray(mergedArray);
    }
}
