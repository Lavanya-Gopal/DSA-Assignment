public class MidOf3Elements {
    public static void main(String[] args) {
        System.out.println("Approach 1:");
        System.out.println(FindMidApproach1(56, -1, 3));
        System.out.println("Approach 2:");
        System.out.println(FindMidApproach2(56, -1, 3));
    }

    public static long FindMidApproach1(int i, int j, int k) {
        long max = maxof3elements.FindMax(i, j, k);
        long min = MinOF3Elements.FindMin(i, j, k);
        if (i != max && i != min) {
            return i;
        } else if (j != max && j != min) {
            return j;
        } else {
            return k;
        }

    }

    private static long FindMidApproach2(int i, int j, int k) {
        if((i>j && i<k) || (i<j && i>k)){
            return i;
        }
        else if((j>i && j<k) || (j<i && j>k)){
                return j;
        }
        else{
            return k;
        }
    }
}
