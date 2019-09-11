package chapter2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Integers {
    public static LinkedList<Integer> task559(int n) {
        LinkedList<Integer> numbers = new LinkedList<>();
        int numberOfMersen = 0;
        for (int i = 0; i < n; i++) {
            numberOfMersen = ((int) Math.pow(2, i) - 1);
            if (numberOfMersen < n) {
                numbers.add(numberOfMersen);
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

    public static int task560(int n){
        int sum=0;
        for(int i=1;i<n;i++) {
                if (n%i==0)
                    sum+=i;
            }
        return sum;

    }

}
