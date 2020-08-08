/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usage.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Class which re-arrages +ve/-ve integers in array
 * 
 * @author piya
 */
public class RearrangePositiveNegativeElements {
    private static final int ARRAY_SIZE = 5;
    /**
     * Accept an integer array input from user
     *
     * @return anArray input from user
     */
    public static int[] getIntegerArray() {
        int[] anArray = new int[ARRAY_SIZE];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer array elements: ");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = sc.nextInt();
        }
        System.out.println("Input array: " + Arrays.toString(anArray));
        return anArray;
    }

    /**
     * Sort integer array
     *
     * @param anArray unsorted integer array
     * @return anArray sorted integer array
     */
    public static int[] sortArray(int[] anArray) {
        //Arrays.sort(anArray);
        //Bubble sort implementation of sorting
        int temp = 0;
        for (int i = 0; i < anArray.length-1; i++) {
            for (int j = 0; j < anArray.length-i-1; j++) {
                if (j + 1 == anArray.length) {
                    break;
                }
                if (anArray[j] > anArray[j + 1]) {
                    temp = anArray[j];
                    anArray[j] = anArray[j + 1];
                    anArray[j + 1] = temp;
                }
            }
            System.out.println("usage.Array while sorting: " + Arrays.toString(anArray));

        }
        return anArray;
    }

    public static void main(String[] args) {
        int[] anArray = sortArray(getIntegerArray());
        System.out.println("After sorting: " + Arrays.toString(anArray));
        List<Integer> postiveArray = new ArrayList<>();
        List<Integer> negativeArray = new ArrayList<>();
        for (int i = 0; i < anArray.length; i++) {
            if(anArray[i] == 0){
                //ignore 0 as neither postive not negative
            }
            else if(anArray[i]>0){
                postiveArray.add(anArray[i]);
            }
            else{
                negativeArray.add(anArray[i]);
            }
        }
        System.out.println("Positive array: " + Arrays.toString(postiveArray.toArray()));
        System.out.println("Negative array: " + Arrays.toString(negativeArray.toArray()));
    }
}
