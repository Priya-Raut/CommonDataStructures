package usage.array;

import java.util.HashMap;
import java.util.Map;
/*
arr = {-2,0,2,3,-3,4,-7}
  problem statement : find subarrays ( sequence one ) - whose sum is zero
explanation :

 {-2,0,2}
 {3,-3} 2
 {-2,0,2,3,-3}
 {0}
 output: total count is 4
 intuition
 -2, 0, 2,3,4,-7
 -2 -2  0 3 7 0
 -2 + 0 = -2 -> subarray cnt: 1
 -2 + 0 + 2 = 0 -> subarray cnt: 2
  0 + (3 + 4 + -7) = 0 -> subarray cnt: 3
  3 + 4 + -1 = 0 -> subarray cnt: 4

 -2, 2, -3, 3, 4, -7
 -2  0  -3  0  4  -3
 count the times when sum is 0
 count the times a sum is occurring more than once
 how? sum -> count
       -2     1
        0     2
       -3     2
        4     1

 algo:
   sum = 0
   for every element
     sum = sum + elem
     count = map.getOrDefault(sum,0);
     map.put(sum, ++count)

   find elem with val > 1
     count = add elem
   return count

*/
public class CountSubArraysWithZeroSum {
    static Map populateSumCountMap(int[] nums){
        int sum = 0, count = 0;
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            sum = sum + nums[i];
            count = sumCountMap.getOrDefault(sum, 0);
            sumCountMap.put(sum, ++count);
        }
        return sumCountMap;
    }
    static int findSubArrayWithZeroSum(int[] nums){
        Map<Integer, Integer> sumCountMap = populateSumCountMap(nums);
        int result = 0;
        for(int key : sumCountMap.keySet()) {
//            System.out.println(key + " " + sumCountMap.get(key));
            int count = sumCountMap.get(key);
            if (count > 1) {
                result = result + count;
            }
            System.out.println("occurrance: " + count);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 2, -3, 3, 4, -7};
        int result = findSubArrayWithZeroSum(nums);
        System.out.println(result);
    }
}


