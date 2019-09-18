package chapter1;

import utils.Util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    public static List task330(int number) {
        List<Integer> listOfPerfectNumbers = new ArrayList();
        for (int i = 1; i < number; i++) {
            if (Util.getSumtoFindPerfectNumbers(i) == i)
                listOfPerfectNumbers.add(i);
        }
        return listOfPerfectNumbers;
    }

    public static int[] task340(final int m, final int[] startArray) {
        int i = 0;
        int j = 0;
        int k = 0;
        System.out.print("The starting array is --> ");
        for (int item : startArray) {
            System.out.print(item + " ");
        }
        while (i < 20) {
            if (startArray[i] + startArray[j] + startArray[k] == m) {
                return new int[]{i, j, k};
            }
            if (k < 19) {
                k++;
            } else {
                k = 0;
                j++;
            }
            if (j == 20) {
                j = 0;
                i++;
            }
        }
        return null;
    }

    public static List<Integer> task331b(int a) {
        List<Integer> numbers = new ArrayList();
        for (int i = 1; i < Math.sqrt(a); i++) {
            for (int j = 1; j < i; j++) {
                for (int k = 1; k < j; k++) {
                    int sum = (int) (Math.pow(i, 2) + Math.pow(j, 2) + Math.pow(k, 2));
                    if (sum == a) {
                        numbers.add(i);
                        numbers.add(j);
                        numbers.add(k);
                    }
                }
            }
        }
        return numbers;
    }

    public static ArrayList task323(int n) {
        ArrayList relativelySimpleNumbers = new ArrayList();
        for (int i = 2; i < n; i++) {
            if (gcd(i, n) == 1)
                relativelySimpleNumbers.add(i);
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

    public static int task332(int n) {
        int x, y, t;

        for (int i = (int) Math.sqrt(n / 4); i * i <= n; i++) {
            x = n - i * i;
            for (int j = (int) Math.sqrt(x / 3); j <= i && j * j <= x; j++) {
                y = x - j * j;
                for (int k = (int) Math.sqrt(y / 2); k <= j && k * k <= y; k++) {
                    t = (int) Math.sqrt(y - k * k);
                    if (t <= k && t * t == y - k * k) {
                        System.out.println("Offered options are: \n(" + i + "^2) + (" + j + "^2) + (" + k + "^2) + (" + t + "^2)");
                    }
                }
            }
        }
        return n;
    }

}
