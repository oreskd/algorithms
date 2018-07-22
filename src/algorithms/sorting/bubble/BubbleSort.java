package algorithms.sorting.bubble;

public class BubbleSort {
    public static void sort(int[] arr) {
        boolean hadChanges = true;

        // iterate as long as there were some changes in the previous iteration
        for (int i = 0; hadChanges; i++) {
            hadChanges = false;

            // compare j-th element with j+1 and change if needed
            // result: the biggest element will be placed at the last index of the subarray (N - 1 - i)
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j+1] < arr[j]) {
                    int helper = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = helper;

                    hadChanges = true;
                }
            }
        }
    }
}
