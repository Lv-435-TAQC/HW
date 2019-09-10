package Chapter1;

import java.util.ArrayList;
import java.util.LinkedList;

public class NestedLoops {
    public static LinkedList<Integer> task329(int n, int m){
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
    public static ArrayList<Integer> task331a(Integer n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int h = 1; h <= n; h++) {
                    if ((i * i + j * j + h * h) == n) {
                        a.add(i);
                        a.add(j);
                        a.add(h);
                    }
                }
            }
        }
        return a;
    }
}
