
package Week1;

public class RotateBy1 {
    public static void main(String[] args) {
        rotate(new int[] { 1, 2, 3, 4, 5 }, 5);
    }

    public static void rotate(int arr[], int n) {
        int temp = arr[n - 1];
        int prev = 0;
        for (int i = 1; i < n ; i++) {
            if (i == 1) {
                prev = arr[i];
                arr[i] = arr[i - 1];
            } else {
                int curr = prev;
                prev = arr[i];
                arr[i] = curr;
            }
        }
        arr[0] = temp;
    }

}
