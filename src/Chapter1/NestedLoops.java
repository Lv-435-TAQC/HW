package chapter1;

import java.util.ArrayList;
import java.util.LinkedList;

public class NestedLoops {
    public static LinkedList<Integer> task329(int n, int m) {
        LinkedList<Integer> listEqualsSquareSum = new LinkedList<>();
        for (int i = n - 1; i > 0; i--) {
            int sumDigitsOfNumber;
            sumDigitsOfNumber = 0;
            for (int j = i; j > 0; ) {
                sumDigitsOfNumber += (j % 10);
                j = j / 10;
            }
            if (Math.pow(sumDigitsOfNumber, 2) == m) {
                listEqualsSquareSum.add(i);
            }
        }
        return listEqualsSquareSum;
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
    public static int task330(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if (n%i==0)
                sum+=i;
        }
        return sum;
    }
}
