package Week1;
public class JumpNext {
    public static void main(String[] args) {
        System.out.println(minJumps(new int[] { 1, 4, 3, 2, 6, 7}));
    }

    static int minJumps(int[] arr) {
        int jump = 1;
        int n = arr.length - 1;
        int person = arr[0];
        int temp = person;
        int personindex = 0;
        if (personindex >= n) {
            return jump;
        }
        for (personindex = temp; personindex < arr.length - 1;) {
         
            if (personindex >= n) {
                return jump;
            } else {
                int arrsize = arr[personindex];
                if (personindex + arrsize > n) {
                    personindex += n - personindex;
                } else {
                    personindex += arr[personindex];
                }
                person = arr[personindex];
                jump++;
            }
        }
        if (personindex >= n) {
            return jump;
        } else {
            return -1;
        }

    }
}
