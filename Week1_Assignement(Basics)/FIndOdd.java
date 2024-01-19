import java.util.ArrayList;
import java.util.List;

public class FIndOdd {
    public static void main(String[] args) {

        System.out.println(FindOdd(new int[]{1,5,6,4,3,2,8}));
    }

    private static List<Integer> FindOdd(int[] arr) {
        List<Integer> Odd = new ArrayList<>();
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]%2!=0){
                Odd.add(arr[i]);
            }
        }
        return Odd;
        
    }

    
    
}
