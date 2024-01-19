public class MinOF3Elements {
    public static void main(String[] args) {
        System.out.println(FindMin(-45, 4, 6));

    }

    public static long FindMin(int i, int j, int k) {
        if (i < j && i < k) {
            return i;
        } else if (j < i && j < k) {
            return j;
        } else {
            return k;
        }

    }
}
