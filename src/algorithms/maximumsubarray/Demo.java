package algorithms.maximumsubarray;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maximumSubarraySum = KadaneAlgorithm.getMaximumSubarraySum(arr);
        System.out.println(maximumSubarraySum);
    }
}
