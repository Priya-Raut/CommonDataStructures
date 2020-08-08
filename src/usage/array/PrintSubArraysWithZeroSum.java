package SubArryQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *     4, 2, -3, 1, 6
 *     4  6   3  4
 *
 *
 *     -2,0,2,3,-3,4,-7
 *     -2-2 0 3  0 4 -3
 *
 *      6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7
 *
 *      when sum = 0, subarray has elements from nums[0] to nums[i]
 *     -2 0 2
 *     -2,0,2,3,-3
 *      when sum exists, (index of sum)+1 to nums[i]
 *      0
 *      3 -3
 *      question: how to know the previous index of this sum
 *      sum -> index
 */
class Pair{
    int start;
    int end;
    Pair(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class PrintSubArraysWithZeroSum {
    /*
                  4, 2, -3, 1, 6
                  4  6   3  4

                  4 0
                  6 1
                  3 2



     */
    static List findStartAndEndIndices(int[] nums){
        List<Pair> startEndIndices = new ArrayList<>();
        Map<Integer, List<Integer>> sumIndexListMap = new HashMap<>();

        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum == 0){
                startEndIndices.add(new Pair(0, i));
            }
            List<Integer> indexList = new ArrayList<>();
            if(sumIndexListMap.containsKey(sum)){
                indexList = sumIndexListMap.get(sum);
                for(int index : indexList){
                    startEndIndices.add(new Pair(index+1, i));
                }
            }
            indexList.add(i);
            sumIndexListMap.put(sum, indexList);
        }
        for(int key : sumIndexListMap.keySet()){
            System.out.println(key + " " + sumIndexListMap.get(key));
        }
        return startEndIndices;
    }

    static List<List<Integer>> getSubArraysUsingStartEndIndices(List<Pair> startEndIndices){
        List<List<Integer>> subArrays = new ArrayList<>();

        return subArrays;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        List<Pair> startEndIndices = findStartAndEndIndices(nums);
        for(Pair pair : startEndIndices){
            System.out.println(pair.start + " " + pair.end);
        }
//        List<List<Integer>> subArrays = getSubArraysUsingStartEndIndices(startEndIndices);
//        for( List<Integer> subArray: subArrays){
//            System.out.println(subArray);
//        }
    }
}
