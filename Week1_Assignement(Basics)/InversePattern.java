public class InversePattern {
    public static void main(String[] args) {
        PrintInversePattern(5);
    }

    public static void PrintInversePattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}