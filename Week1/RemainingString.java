package Week1;

public class RemainingString {
    public static void main(String[] args) {
        System.out.println(printString("y",'y',0));
    }
    public static String printString(String S, char ch, int count) {
        // code here
        int occurance = 0;
        int strlen = S.length()-1;
        String res ="";
        
        for(int i = 0 ; i<S.length();i++){
            if(S.charAt(i)==ch){
                occurance++;
                if(count==occurance||occurance>=count){
                    if(i==strlen){
                        res ="Empty string";
                    }
                    else{
                        res = S.substring(i+1,S.length());
                    }
                    
                }
            }
           
        }
        if(res==""){    
                res ="Empty string";
        }
        return res;
}
}