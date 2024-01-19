public class maxof3elements {
    public static void main(String args[]) {
       System.out.println(FindMax(-45, 4, 6)) ;
    }

    public static long FindMax(int i, int j, int k) {
        if (i > j && i > k) {
            return i;
        } else if (j > i && j > k) {
            return j;
        } else {
            return k;
        }

    }

}
