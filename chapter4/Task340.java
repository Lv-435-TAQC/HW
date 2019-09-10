package edu.hw2.chapter4;


public class Task340 {

    private static int[] fillUpTheArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + ((int) (Math.random() * 10));
        }
        return array;
    }

    private static int[] findThreeNumbersWithSpecificConditions(int[] startArray, int m) {
        int i = 0;
        int j = 0;
        int k = 0;
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

    private static void demonstrate() {
        int[] resultArray = null;
        int[] startingArray;
        int m = 12;
        while (resultArray == null) {
            startingArray = fillUpTheArray();
            System.out.print("The starting array is --> ");
            for (int item : startingArray) {
                System.out.print(item + " ");
            }
            resultArray = findThreeNumbersWithSpecificConditions(startingArray, m);
        }
        if (resultArray == null) {
            System.out.print("\nThere are no three numbers which can satisfy the conditions " + m);
        } else {
            System.out.print("\nThe three numbers which can satisfy the equation a(i) + a(j) + a(k) = " + m + " are --> ");
            for (int item : resultArray) {
                System.out.print(item + " ");
            }
        }
    }

    public static void main(String[] args) {
        demonstrate();
    }
}
