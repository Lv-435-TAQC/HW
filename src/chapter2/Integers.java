package chapter2;

import utils.Util;

import java.util.*;

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

    public static Map<Integer,Integer> task560() {
        int firstNum = 0;
        int secondNum = 0;
        Map<Integer,Integer> friendlyNumbers = new HashMap();
        for (int i = 200; i <= 300; i++) {
            firstNum = Util.getSumtoFindPerfectNumbers(i);
            secondNum = Util.getSumtoFindPerfectNumbers(firstNum);
            if (i == secondNum)
                friendlyNumbers.put(firstNum,secondNum);
        }
        return friendlyNumbers;
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
    public static List<ArrayList<Integer>> task554(int n){
        List<ArrayList<Integer>> pythagoreanTriples = new ArrayList<>();
        for(int c=1; c<=n; c++){
            for(int b=1; b<=c; b++){
                for(int a=1; a<=b; a++){
                    if((Math.pow(a,2)+Math.pow(b,2)) == Math.pow(c,2)){
                        ArrayList<Integer> ints = new ArrayList<>();
                                ints.add(a);
                                ints.add(b);
                                ints.add(c);
                        pythagoreanTriples.add(ints);
                    }
                }
            }
        }
        return pythagoreanTriples;
    }

}
