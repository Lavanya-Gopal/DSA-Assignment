public class FindSum {
    public static void main(String[] args) {
        System.out.println(FindSumOFElements(new int[]{1,2,6,3,5}));
    }

    private static long FindSumOFElements(int[] arr) {
        long sum=0; 
        for(int i = 0 ; i< arr.length ; i++){
                 sum+=arr[i];
        }
        return sum;
    }
}
