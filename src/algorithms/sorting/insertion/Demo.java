package algorithms.sorting.insertion;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3};
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
