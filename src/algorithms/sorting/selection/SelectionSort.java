package algorithms.sorting.selection;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the smallest element in the subarray
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // switch the smallest element with the first element of the subarray
            int helper = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = helper;
        }
    }
}
