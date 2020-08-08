package usage.array;/*package whatever //do not write package name here */

import java.lang.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array a[] of N positive and negative numbers.
 * Find if there is a subarray (of size at-least one) with 0 sum.
 *
 * https://practice.geeksforgeeks.org/problems/subarray-with-0-sum/0
 *
 * Intuition:
 *    array: 4, 2, -3, 1, 6
 *    sum:   4  6   3  4
 *    Now since sum is returns back to an old value, 4 . . 4
 *    all elements we added to 4 must become 0
 *    why? 1 + 0 = 1
 *         4 + (2 + - 3 + 1) = 4 + 0 = 4
 *    So look for the sum which already exists in sumSet
 *
 *  find sum when every element gets added
 *  if sum exists in sumSet already
 *      return true
 *  else
 *      add sum into sumSet
 *
 * Time Complexity: O(n), only one iteration
 * Space Complexity: O(n), for sumSet
 */
class CheckForASubArrayWithZeroSum_2 {
    public static boolean containsSubarrayWithZeroSum(int[] nums){
        /*
        find sum when every element gets added
 *  if sum exists in sumSet already
 *      return true
 *  else
 *      add sum into sumSet
      array: 4, 2, -3, 1, 6
 *    sum:   4  6   3  4
         */
        int sum = 0;
        Set<Integer> sumSet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            System.out.println("sum: " + sum);
            if(sumSet.contains(sum)) return true;
            else sumSet.add(sum);
            System.out.println("sumSet: " + sumSet);
        }
        return false;
    }
    public static void main (String[] args) {
        int[] nums1 = new int[]{4, 2, -3, 1, 6}; //success case
        int[] nums2 = new int[]{4, 2, -3, 6};   //failure case
        int[] nums3 = new int[]{1};             //edge case
        boolean result = containsSubarrayWithZeroSum(nums1);
        System.out.println(result);
    }
}
/*

 */
