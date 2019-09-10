package chapter15;
import java.util.LinkedList;
public class task559 {
   public static LinkedList<Integer> numbersAreSmallerMersenNumbers(int n){
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
}