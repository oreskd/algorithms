package algorithms.sorting.insertion;

public class InsertionSort {
    public static void sort(int[] arr) {
        for(int j = 1; j < arr.length; j++) {
            // "key" is the element whose position in the subarray is about to be determined
            int key = arr[j];

            // once this block is done, "i" will be the index of an element smaller than "key" or -1
            int i = j - 1;
            while(i >= 0 && arr[i] > key) {
                arr[i+1] = arr[i];
                i--;
            }

            // place "key" next to the element on position "i"
            arr[i + 1] = key;
        }
    }
}
