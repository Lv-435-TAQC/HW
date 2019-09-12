package chapter1;


import utils.Util;

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

    public static int task330(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }

    public static void task340() {
        int[] resultArray;
        int[] startingArray = Util.fillUpTheArray(20);
        int m = 12;
        System.out.print("The starting array is --> ");
        for (int item : startingArray) {
            System.out.print(item + " ");
        }
        resultArray = Util.findThreeNumbersWithSpecificConditions(startingArray, m);
        if (resultArray == null) {
            System.out.print("\nThere are no three numbers which can satisfy the conditions " + m);
        } else {
            System.out.print("\nThe three numbers which can satisfy the equation a(i) + a(j) + a(k) = " + m + " are --> ");
            for (int item : resultArray) {
                System.out.print(item + " ");
            }
        }
        System.out.println();
    }

    public static void task331b(int a) {
        for (int i = 1; i < Math.sqrt(a); i++) {
            for (int j = 1; j < i; j++) {
                for (int k = 1; k < j; k++) {
                    int sum = (int) (Math.pow(i, 2) + Math.pow(j, 2) + Math.pow(k, 2));
                    if (sum == a)
                        System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    public static ArrayList task323(int n) {
        ArrayList relativelySimpleNumbers = new ArrayList();
        for (int i = 2; i < n; i++) {
            boolean a = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                if (gcd(i, n) == 1)
                    relativelySimpleNumbers.add(i);
            }
        }
        return relativelySimpleNumbers;
    }

    private static int gcd(int a, int b) {
        int t;
        while (b != 0) {
            t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public static ArrayList<Integer> task325(int n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 && Util.isPrimeNumber(i)) {
                a.add(i);
            }
        }
        return a;
    }
}
