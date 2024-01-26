package Week1;

public class RLE {
    public static void main(String[] args) {
        System.out.println(Compress("abbac"));
    }

    private static String Compress(String str) {

        String encoding = "";
        for (int i = 0; i <str.length(); i++) {
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count++;
            }
            encoding += count + str.charAt(i);
        }
        return encoding;

    }

}
