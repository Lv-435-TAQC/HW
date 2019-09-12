package chapter2;

import utils.Util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    public static List<Integer> task569(int n) {
        List<Integer> result = new ArrayList<>();
        List<Integer> seriesOfNFirstPrimeNumbersAfterTwoThreeAndFive = new ArrayList<>();
        int naturalNumber = 1;
        int possiblePrimeNumber = 7;
        while (seriesOfNFirstPrimeNumbersAfterTwoThreeAndFive.size() != n) {
            if (Util.isPrimeNumber(possiblePrimeNumber)) {
                seriesOfNFirstPrimeNumbersAfterTwoThreeAndFive.add(possiblePrimeNumber);
            }
            possiblePrimeNumber++;
        }
        while (result.size() != n) {
            for (int j = 0; j < seriesOfNFirstPrimeNumbersAfterTwoThreeAndFive.size(); j++) {
                if (naturalNumber % 2 == 0 && naturalNumber % 3 == 0 && naturalNumber % 5 == 0
                        && naturalNumber % seriesOfNFirstPrimeNumbersAfterTwoThreeAndFive.get(j) != 0) {
                    result.add(naturalNumber);
                    break;
                }
            }
            naturalNumber++;
        }
        return result;
    }
}
