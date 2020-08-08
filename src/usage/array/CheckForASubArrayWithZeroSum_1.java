package usage.array;/*package whatever //do not write package name here */

import java.lang.*;

/**
 * Given an array a[] of N positive and negative numbers.
 * Find if there is a subarray (of size at-least one) with 0 sum.
 * https://practice.geeksforgeeks.org/problems/subarray-with-0-sum/0
 * Intuition:
 *     Find every subarray from the given array
 *     Check if sum is 0, if yes return true
 *                        else return false
 *     4
 *     4 2
 *     4 2 -3
 *     4 2 -3 1
 *     4 2 -3 1 6
 *     2
 *     2 -3
 *     2 -3 1
 *     2 -3 1 6
 *     -3
 *     -3 1
 *     -3 1 6
 *     1
 *     1 6
 *     6
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */
class CheckForASubArrayWithZeroSum_1 {
    public static boolean containsSubarrayWithZeroSum(int[] nums){
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                //System.out.println("sum: " + sum + " nums[j]: " + nums[j]);
                if(sum == 0) return true;
            }
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
