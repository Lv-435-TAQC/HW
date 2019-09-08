package chapter7_2;
import creationExaptions.taskExeption;
import java.util.LinkedList;

public class task226 {
    public LinkedList<Integer> commonMultipleOfTwoNumbers(int m, int n) throws taskExeption{
        LinkedList<Integer>listMultipleNumbers = new LinkedList<>();
        if(m < 1 || n < 1 )  throw new taskExeption("don`t use digitals less then 1");
        int max = m * n;
        for(int iter = max; iter > 0; iter--){
            if((iter % m) == 0  && (iter % n) == 0) {
                listMultipleNumbers.add(iter);
            }
        }
        return listMultipleNumbers;
    }
}
