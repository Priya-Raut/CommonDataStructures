/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Find non repeating integers from a given array
 * @author piya
 */
public class NonRepeatingIntegers {
    private static final int ARRAY_SIZE = 5;
    /**
     * Accept an integer array input from user
     *
     * @return anArray input from user
     */
    public static int[] getIntegerArray(){
        int[] anArray = new int[ARRAY_SIZE];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer array elements: ");
        for (int i=0; i< anArray.length ; i++){
            anArray[i] = sc.nextInt();
        }
        System.out.println("Input array: " + Arrays.toString(anArray));
        return anArray;
    }
    
    public static List getNonRepeatingIntegers(int[] anArray){
        //Map with element as key, its frequency as value
        Map<Integer, Integer> map = new HashMap<>();
        //List to store non repeating elements
        List<Integer> list = new ArrayList<>();
        int value = 0;
        
        for (int num : anArray){
            if (map.containsKey(num)){//if key exists, update value by 1
                System.out.println(num + " key exists");
                value = map.get(num);
                map.put(num, ++value);
            }
            else{//add key in map if key does not exist
                System.out.println(num + " key does not exist");
                map.put(num, 1);
            }
            System.out.println("Key: " + num + " Value: " + map.get(num));
        }
        
        for(int num : anArray){
            if(map.get(num) == 1){
                list.add(num);
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        List list = getNonRepeatingIntegers(getIntegerArray());
        System.out.println("Non repeating integers: " + Arrays.toString(list.toArray()));
    }
}
