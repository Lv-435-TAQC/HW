package Chapter2;
import java.util.ArrayList;
import java.util.LinkedList;

public class Integers {
   public static LinkedList<Integer> task559(int n){
       LinkedList<Integer> numbers = new LinkedList<>();
       int mersensMumber = 0;
       for(int i = 0 ; i < n ; i++ ){
           mersensMumber = ((int)Math.pow( 2, i) - 1);
            if(mersensMumber < n){
                numbers.add(mersensMumber);
            }
       }
       return numbers;
   }
    public static ArrayList<Integer> task561(Integer n) {
        ArrayList<Integer> a = new ArrayList<>();
        String test;
        for (int i = 1; i <= n; i++) {
            test = Integer.toString(i * i);
            test = test.substring(test.length() - Integer.toString(i).length());
            if (i == Integer.parseInt(test)) {
                a.add(i);
            }
        }
        return a;
    }
}
