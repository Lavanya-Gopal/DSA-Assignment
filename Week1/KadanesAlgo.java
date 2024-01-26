package Week1;

public class KadanesAlgo {
    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }, 9));
    }

    public static long maxSubarraySum(int arr[], int n) {
        long max = 0, sum = 0;
        for (int i = 1; i < n; i++) {
            if (sum >= 0) {
                sum += arr[i];
            } else {
                sum = arr[i];
            }
            max = Math.max(sum, max);

        }
        return max;
    }

}
