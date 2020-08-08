package usage.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeKSortedArrays {
    /**
     * Time complexity: nlogn
     *
     * @param sortedArrays
     * @return
     */
    public static List<Integer> mergeKSortedArrays(List<List<Integer>> sortedArrays) {
        List<Integer> mergedSortedArray = new ArrayList<>();
        sortedArrays.forEach(innerArray -> mergedSortedArray.addAll(innerArray));
        Collections.sort(mergedSortedArray);
        return mergedSortedArray;
    }

    public static void main(String[] args) {
        List<List<Integer>> sortedArrays = new ArrayList<>();
        sortedArrays.add(Arrays.asList(1, 3, 4));
        sortedArrays.add(Arrays.asList(2, 5, 7));
        sortedArrays.add(Arrays.asList(2, 9, 10));
        List<Integer> mergedSortedArray = mergeKSortedArrays(sortedArrays);
        System.out.println(mergedSortedArray);
    }
}
