package Week1;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        // System.out.println(subarraySum(new int[] { 135, 101, 170, 125, 79, 159, 163,
        // 65, 106, 146, 82, 28, 162, 92, 196,
        // 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139,
        // 70, 113, 68, 100, 36, 95,
        // 104, 12, 123, 134 }, 42, 468));

        // System.out.println(OptimizedsubarraySum(new int[] { 135, 101, 170, 125, 79,
        // 159, 163, 65, 106, 146, 82, 28, 162,
        // 92, 196,
        // 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139,
        // 70, 113, 68, 100, 36, 95,
        // 104, 12, 123, 134 }, 42, 468));

        System.out.println(OptimizedsubarraySum(new int[] { 1, 2, 3, 7, 5 }, 5, 12));
    };

    static ArrayList<Integer> OptimizedsubarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> res = new ArrayList<>();
        int left = 0;
        int right = 0;
        int sum = 0;
        if (n == 1) {
            if (arr[0] == s) {
                res.add(1);
                res.add(1);
                return res;
            }
        }
        sum = arr[left];
        right = 1;
        while (left <= right) {
            sum += arr[right];

            if (sum == s) {
                res.add(left + 1);
                res.add(right + 1);
                return res;
            }
            if (sum > s) {
                sum = sum - arr[left];
                if (sum == s) {
                    res.add(left + 1);
                    res.add(right + 1);
                    return res;
                }
                left++;
            }
            right++;
        }
        res.add(-1);
        return res;

    };

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == s) {
                res.add(i + 1);
                res.add(i + 1);
                return res;
            }
            for (int j = i + 1; j < n; j++) {
                sum = sum + arr[j];

                if (sum == s) {
                    res.add(i + 1);
                    res.add(j + 1);
                    return res;
                }
                if (sum > s) {
                    break;
                }
            }
        }
        res.add(-1);
        return res;
    }
}
