public class FirstEvenNumber {
    public static void main(String[] args) {
        System.out.println(FindFirstEvenNum(new int[]{1,2,6,3,5}));
        System.out.println(FindFirstEvenNum(new int[]{1,7,11,3,5}));
        System.out.println(FindFirstEvenNum(new int[]{1,7,4,8,5}));


    }

    private static long FindFirstEvenNum(int[] arr) {
       for(int i = 0 ; i<arr.length;i++){
        if(arr[i]%2==0){
            return arr[i];
        }
       }
       return -1;
    }
}
