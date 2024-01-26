package Week1;

import java.util.ArrayList;
import java.util.List;

public class Pascal{
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> printPascal(int n){
        List<List<Integer>>pascal = new ArrayList<>();
      for(int i = 1; i<=n;i++){
         List<Integer> li = new ArrayList<Integer>();
          if(i==1||i==n){
              li.add(1);
          }
         List<Integer> prev = new ArrayList<>();
          prev = pascal.get(i-1);
          li.add(prev.get(i)+prev.get(i+1));
        
        pascal.add(li);
        
      }
      return pascal;
    }
}