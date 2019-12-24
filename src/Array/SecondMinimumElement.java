/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author piya
 */
public class SecondMinimumElement {
    public static void main(String args[]){
        int[] anArray = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for (int i=0; i< anArray.length ; i++){
            anArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(anArray));
        Arrays.sort(anArray);
        System.out.println(Arrays.toString(anArray));
        System.out.println(anArray[1]);
    }
}
