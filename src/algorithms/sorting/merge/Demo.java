package algorithms.sorting.merge;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 3, 6, 3, 2};
        System.out.println("Input: " + Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println("Output: " + Arrays.toString(arr));
    }
}
