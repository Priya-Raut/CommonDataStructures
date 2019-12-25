/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Find second minimum element of an array
 *
 * @author piya
 */
public class SecondMinimumElement {

    /**
     * Accept an integer array input from user
     *
     * @return anArray input from user
     */
    public static int[] getIntegerArray(){
        int[] anArray = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer array elements: ");
        for (int i=0; i< anArray.length ; i++){
            anArray[i] = sc.nextInt();
        }
        return anArray;
    }

    /**
     * Find second minimum element of an integer array
     *
     * @param anArray an integer array
     * @return second minimum element of an array
     */
    public static int getSecondMinimumElement(int[] anArray){
        System.out.println("Before sorting: " + Arrays.toString(anArray));
        Arrays.sort(anArray);
        System.out.println("After sorting: " + Arrays.toString(anArray));
        return anArray[1];
    }

    public static void main(String args[]){
        System.out.println("Second minimum element of array: " +getSecondMinimumElement(getIntegerArray()));
    }
}
