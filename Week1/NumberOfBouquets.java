
package Week1;

public class NumberOfBouquets {
    public static void main(String[] args) {
        System.out.println(CountDays(new int[] { 97,83}, 2, 1));
    }

    private static int CountDays(int[] arr, int bou, int adj) {
        if (arr.length  < bou * adj) {
            return -1;
        }

        // Find Min and Max
        int first = arr[0];
        int last = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= first) {
                first = arr[i];
            }
            if (arr[i] >= last) {
                last = arr[i];
            }
        }
        int result = -1;
        while (first <= last) {
            int mid = (first + last) / 2;
            int ans = isBouqetsAreReady(mid, arr, bou, adj);
            if (ans >= bou) {
                result = mid;
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return result;

    }

    private static int isBouqetsAreReady(int mid, int[] arr, int bou, int adj) {
        int NumberOfBouquets = 0;
        int adjacentflowers = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (mid >= arr[i]) {
                adjacentflowers++;
                if (adjacentflowers == adj) {
                    NumberOfBouquets++;
                    adjacentflowers = 0;
                    if (NumberOfBouquets == bou) {
                        return NumberOfBouquets;
                    }
                }
            } else {
                adjacentflowers = 0;
            }
        }
        return NumberOfBouquets;
    }
}