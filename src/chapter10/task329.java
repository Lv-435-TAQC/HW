package chapter10;
import creationExaptions.taskExeption;
import java.util.LinkedList;

public class task329 {
    public LinkedList<Integer> squareSumOfDigitsWhichEqualToGivenNumber(int n, int m)throws taskExeption{
            LinkedList<Integer> listEqualseSquareSum = new LinkedList<>();
        if(m < 1 || n < 1)
            throw new taskExeption("check your digitals, don`t use arguments less then 1");
            for( int i = n - 1 ; i > 0 ; i-- ){
                int sumDigitsOfNumber=0;
                for(int j = i ; j > 0;) {
                    sumDigitsOfNumber += (j % 10);
                    j = j / 10;
                }
                if (Math.pow(sumDigitsOfNumber, 2) == m) {
                    listEqualseSquareSum.add((Integer) i);
                }
            }
        return listEqualseSquareSum;
    }
}
