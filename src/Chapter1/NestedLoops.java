package Chapter1;

import java.util.LinkedList;

public class NestedLoops {
    public static LinkedList<Integer> tasl329(int n, int m){
        LinkedList<Integer> listEqualseSquareSum = new LinkedList<>();
        for( int i = n - 1; i > 0 ; i-- ){
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
