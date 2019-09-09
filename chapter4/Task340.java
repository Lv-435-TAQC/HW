package edu.hw2.chapter4;


public class Task340 {

    private final static int[] startArray = fillUpTheArray();
    private final static int m = (int) (Math.random() * 10);
    private static int[] result;

    private static int[] fillUpTheArray() {
        int[] array = new int[20];
        for (int i = 0; i <= array.length -1; i++) {
            array[i] = i + ((int) (Math.random() * 10));
        }
        return array;
    }

    private static void findThreeNumbersWithSpecificConditions() {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < 19) {
            while (j < 19) {
                while (k < 19) {
                        if (startArray[i] + startArray[j] + startArray[k] == m) {
                            result = new int[]{i, j, k};
                        }
                    k++;
                }
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.print("The starting array is --> ");
        for (int item : startArray) {
            System.out.print(item + " ");
        }
        findThreeNumbersWithSpecificConditions();
        if (result == null) {
            System.out.println("\nThere are no three numbers which can satisfy the conditions");
        } else {
            System.out.println("\nThe three numbers which can satisfy the equation a(i) + a(j) + a(k) = " + m + " are ");
            for (int item : result) {
                System.out.print(item + " ");
            }
        }
    }
}
