package chapter2;

import utils.Util;

import java.util.*;

public class Integers {
    public static LinkedList<Integer> task559(int n) {
        LinkedList<Integer> numbers = new LinkedList<>();
        int numberOfMersen = 0;
        for (int i = 2; i < n; i++) {
            if (!Util.isNaturalPrimeNumber(i))
                continue;
            numberOfMersen = ((int) Math.pow(2, i) - 1);
            if (numberOfMersen < n) {
                numbers.add(numberOfMersen);
            }
        }
        return numbers;
    }

    /**
     * Find numbers from 1 to n, which looks like 6^2 = 36, or 25^2=625
     *
     * @param n number for search
     * @return ArrayList with numbers which pass condition
     */
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

    public static Map<Integer, Integer> task560() {
        int firstNum = 0;
        int secondNum = 0;
        Map<Integer, Integer> friendlyNumbers = new HashMap();
        for (int i = 200; i <= 300; i++) {
            firstNum = Util.getSumtoFindPerfectNumbers(i);
            secondNum = Util.getSumtoFindPerfectNumbers(firstNum);
            if (i == secondNum) {
                if (firstNum > secondNum)
                    friendlyNumbers.put(firstNum, secondNum);
            }
        }
        return friendlyNumbers;
    }

    /**
     * Method searches for first n natural numbers which divide on no prime numbers except 2, 3 and 5
     *
     * @param n number of natural numbers
     * @return ArrayList of n natural numbers which satisfy the condition
     */
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

    public static List<ArrayList<Integer>> task554(int n) {
        List<ArrayList<Integer>> pythagoreanTriples = new ArrayList<>();
        for (int c = 1; c <= n; c++) {
            for (int b = 1; b <= c; b++) {
                for (int a = 1; a <= b; a++) {
                    if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
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

    public static int[][] task555(int n) {
        int pascalTriangle[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                try {
                    pascalTriangle[i][j] =
                            pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
                } catch (ArrayIndexOutOfBoundsException ex) {
                    if (j == 0) {
                        pascalTriangle[i][j] = 1;
                    }
                } catch (NullPointerException ex) {
                    if (j == i) {
                        pascalTriangle[i][j] = 1;
                    }
                }
            }
        }
        return pascalTriangle;
    }

    public static int task567(int n) {
        for (int i = 1; i < n; i++) {
            if (i * (i + 1) * (i + 2) == n) {
                return i;
            }
            System.out.println(i * (i + 1) * (i + 2));
        }
        return 0;
    }

    public static List<Integer> task562(int n) {
        List<Integer> armstrongsNumbers = new ArrayList();
        for (int i = 100; i < n; i++) {
            String text = String.valueOf(i);
            String firstItem = text.substring(0, 1);
            String secondItem = text.substring(1, text.length() - 1);
            String lastItem = text.substring(text.length() - 1);
            int firstNum = Integer.parseInt(firstItem);
            int secondNum = Integer.parseInt(secondItem);
            int thirdNum = Integer.parseInt(lastItem);
            if (Math.pow(firstNum, 3) + Math.pow(secondNum, 3) + Math.pow(thirdNum, 3) == i) {
                armstrongsNumbers.add(i);
            }
        }
        return armstrongsNumbers;
    }
}
