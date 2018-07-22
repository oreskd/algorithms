package algorithms.sorting.selection;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 3, 6, 3, 2};
        System.out.println("Selection sort, sorting from smallest to largest");
        System.out.println("Input: " + Arrays.toString(arr));
        SelectionSort.sort(arr);
        System.out.println("Output: " + Arrays.toString(arr));
        System.out.println();

        System.out.println("Selection sort, sorting both sides simultaneously");
        int[] arr2 = {5, 1, 3, 3, 6, 3, 2};
        System.out.println("Input: " + Arrays.toString(arr2));
        SelectionSort.sort_both_sides(arr2);
        System.out.println("Output: " + Arrays.toString(arr2));
    }
}
