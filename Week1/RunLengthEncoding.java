package Week1;

public class RunLengthEncoding {
    public static void main(String[] args) {

    }

    public void compress(char[] arr) {

    }

    public void runlength(char[] arr) {
        int idx = 0;
        for (int i = 0, j = 0; i < arr.length - 1;) {
            while (j < arr.length && arr[i] == arr[j]) {
                j++;
                int cnt = j - 1;
                arr[idx] = arr[i];
                char[] charInCnt = String.valueOf(cnt).toCharArray();
                for (char c : charInCnt) {
                    arr[idx] = c;
                    idx++;
                }
            }
        }
    }

    public static int findStartingPoint(char[] c) {
        int totalbenefits = 0;
        int startpos = 0;
        for (int i = 0, j = 0; i < c.length - 1;) {
            while (j < c.length && c[i] == c[j]) {
                j++;
                int cnt = j - i;
                // totalbenefits *= Benefits(cnt);
            }
            if (totalbenefits > 0) {
                startpos = j;

            }
        }
        return -1;
    }
}

// public static int Benefits(int i){
// return i-(1+String.valueOf(i.length()));
// }