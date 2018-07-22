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

    public static void sort_both_sides(int[] arr) {
        int last_index = arr.length - 1;
        for (int i = 0; i <= last_index; i++) {
            // find the smallest and the largest element in the subarray
            int minIndex = i;
            int maxIndex = i;
            for (int j = i+1; j <= last_index; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                } else if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // switch the smallest element with the first element of the subarray
            int helper = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = helper;

            // in case largest element got moved by the previous change, update maxIndex
            if (maxIndex == i) {
                maxIndex = minIndex;
            }

            // switch the largest element with the last element of the subarray
            helper = arr[last_index];
            arr[last_index] = arr[maxIndex];
            arr[maxIndex] = helper;

            last_index--;
        }
    }
}
