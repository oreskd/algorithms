package algorithms.sorting.quick;

public class QuickSort {
    public static void sort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    private static void quicksort(int[] arr, int minIndex, int maxIndex) {
        // a single element is already sorted
        if (minIndex >= maxIndex) {
            return;
        }

        // the last element is a pivot (there are other approaches e.g. pivot is a median between {first, middle, last})
        int pivot = arr[maxIndex];

        // j iterates over the subarray and looks for elements < pivot; if found, the element is placed on i-th position
        int i = minIndex - 1;
        for (int j = minIndex; j < maxIndex; j++) {
            if (arr[j] < pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        // all elements smaller than the pivot are placed from minIndex to i; place the pivot next to i-th element
        i++;
        int tmp = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = tmp;

        // recursively sort both left and right parts
        quicksort(arr, minIndex, i-1);
        quicksort(arr, i+1, maxIndex);
    }
}
