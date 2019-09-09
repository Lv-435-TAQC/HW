package chapter7_2;
import java.util.LinkedList;

public class task226 {
    public static LinkedList<Integer> commonMultipleOfTwoNumbers(int m, int n){
        LinkedList<Integer>listMultipleNumbers = new LinkedList<>();
        int max = m * n;
        for(int iter = max; iter > 0; iter--){
            if((iter % m) == 0  && (iter % n) == 0) {
                listMultipleNumbers.add(iter);
            }
        }
        return listMultipleNumbers;
    }
}
