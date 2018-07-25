package algorithms.sorting.heap;

public class HeapSort {
    public static void sort(int[] arr) {
        // build max-heap
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }

        // extract root (greatest element) from the heap, build heap again and reiterate until sorted
        for (int i = arr.length - 1; i > 0; i--) {
            // move root (greatest element) to the end
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

            // build max-heap for the remaining unsorted subarray (indices {0, ..., i-1})
            // considering everything is already in place except the root, it is only necessary to heapify for the root
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int leftChildIndex = 2*i + 1;
        int rightChildIndex = 2*i + 2;

        int largestIndex = i;
        if (leftChildIndex < n && arr[leftChildIndex] > arr[largestIndex]) {
            largestIndex = leftChildIndex;
        }
        if (rightChildIndex < n && arr[rightChildIndex] > arr[largestIndex]) {
            largestIndex = rightChildIndex;
        }

        if (largestIndex != i) {
            // place the largest element as a root of the subtree
            int tmp = arr[i];
            arr[i] = arr[largestIndex];
            arr[largestIndex] = tmp;

            // continue heapifying deeper in the tree until largestIndex == i
            heapify(arr, n, largestIndex);
        }
    }
}

