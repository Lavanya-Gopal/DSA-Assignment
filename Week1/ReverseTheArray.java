package Week1;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 11, 4, 5, 6, 1, 4, 7 };
        ReverseTheArrayElements(arr);
        for (int a : arr) {
            System.out.print(a + ",");
        }
    }

    private static void ReverseTheArrayElements(int[] arr) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            Swap(arr, i, j);
        }

    }

    private static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
