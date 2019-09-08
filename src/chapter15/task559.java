package chapter15;
import creationExaptions.taskExeption;
import java.util.LinkedList;

public class task559 {
   public LinkedList<Integer> numbersAreSmallerMersenNumbers(int n)throws taskExeption{
       LinkedList<Integer> numbers= new LinkedList<>();
       if(n < 0)
           throw new taskExeption("check your digitals, don`t use arguments less then 1");
       int mersensMumber = 0;
       for(int i = 0 ; i < n ; i++ ){
           mersensMumber = ((int)Math.pow(2,i)-1);
            if(mersensMumber < n){
                numbers.add(mersensMumber);
            }
       }

       return numbers;
   }
}
