package Week1;

public class RotateAnArray {
    public static void main(String[] args) {
        char[] arr = new char[] { '1', 'b', 'c', 'd', 'e', 'f' };
        RotateArray(arr, 3);

        for (char a : arr) {
            System.out.print(a + ",");
        }
    }

    private static void RotateArray(char[] arr, int n) {
        Reverse(arr, n, arr.length - 1);
        Reverse(arr, 0, n - 1);
        Reverse(arr, 0, arr.length - 1);

    }

    private static void Reverse(char[] arr, int i, int j) {
        for (; i < j; i++, j--) {
            Swap(arr, i, j);
        }

    }

    private static void Swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
