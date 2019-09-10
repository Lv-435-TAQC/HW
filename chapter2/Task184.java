package edu.hw2.chapter2;


public class Task184 {

    private final static int p = (int) (Math.random() * 10);
    private final static int q = (int) (Math.random() * 10);
    private static int[] startArray = fillUpTheArray();

    private static int[] fillUpTheArray() {
        int[] array = new int[67];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + ((int) (Math.random() * 10));
        }
        return array;
    }

    private static int[] prepareArrayWithNilsInsteadOfNumbersWithSpecificCondition() {
        for (int i = 0; i < startArray.length; i++) {
            if (startArray[i] % p == q) {
                startArray[i] = 0;
            }
        }
        return startArray;
    }

    public static void main(String[] args) {
        System.out.print("Starting array --> ");
        for (int item : startArray) {
            System.out.print(item + " ");
        }
        int[] array = prepareArrayWithNilsInsteadOfNumbersWithSpecificCondition();
        System.out.print("\nArray with nils instead of numbers, modulus of the division on "
                + p + " of which gives in the remainder " + q + " -->");
        for (int item : array) {
            System.out.print(" " + item);
        }
    }
}
