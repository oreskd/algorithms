package algorithms.sorting.merge;

public class MergeSort {
    public static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    /**
     * Sorts a subarray of the given array.
     * @param arr array
     * @param l left bound (index) of the subarray
     * @param r right bound (index) of the subarray
     */
    private static void mergeSort(int[] arr, int l, int r) {
        if(l < r) {
            // m is the "middle" index
            int m = (l+r) / 2;

            // sort halves
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            // merge sorted halves
            merge(arr, l, m, r);
        }
    }

    /**
     * Merges two sorted subarrays.
     * @param arr array
     * @param l left bound (index) of the first subarray
     * @param m right bound (index) of the first subarray; m+1 is left bound (index) of the second subarray
     * @param r right bound (index) of the second subarray
     */
    private static void merge(int[] arr, int l, int m, int r) {
        // find sizes of subarrays
        int sizeLeft = m - l + 1;
        int sizeRight = r - m;

        // create temp arrays and copy data into them
        int[] leftSubarray = new int[sizeLeft];
        for(int i = 0; i < sizeLeft; i++) {
            leftSubarray[i] = arr[l+i];
        }
        int[] rightSubarray = new int[sizeRight];
        for(int i = 0; i < sizeRight; i++) {
            rightSubarray[i] = arr[m+1+i];
        }

        // merge temp arrays
        int leftIndex = 0;
        int rightIndex = 0;
        int arrIndex = l;
        while(leftIndex < sizeLeft && rightIndex < sizeRight) {
            if(leftSubarray[leftIndex] <= rightSubarray[rightIndex]) {
                arr[arrIndex] = leftSubarray[leftIndex];
                leftIndex++;
            } else {
                arr[arrIndex] = rightSubarray[rightIndex];
                rightIndex++;
            }
            arrIndex++;
        }

        // copy remaining elements from either subarray (if any)
        while(leftIndex < sizeLeft) {
            arr[arrIndex] = leftSubarray[leftIndex];
            leftIndex++;
            arrIndex++;
        }
        while(rightIndex < sizeRight) {
            arr[arrIndex] = rightSubarray[rightIndex];
            rightIndex++;
            arrIndex++;
        }
    }
}
