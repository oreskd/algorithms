package algorithms.maximumsubarray;

import datastructures.utils.IntPair;

public class KadaneAlgorithm {
    /**
     * Runs Kadane's algorithm (https://en.wikipedia.org/wiki/Maximum_subarray_problem#Kadane's_algorithm) to find a
     * maximum subarray of the provided array.
     *
     * @param arr array of integers
     * @return sum of the maximum subarray
     */
    public static int getMaximumSubarraySum(int[] arr) {
        int currentSubarraySum = arr[0];
        int maximumSubarraySum = currentSubarraySum;

        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            currentSubarraySum = Math.max(currentElement, currentSubarraySum + currentElement);
            maximumSubarraySum = Math.max(maximumSubarraySum, currentSubarraySum);
        }

        return maximumSubarraySum;
    }
}
