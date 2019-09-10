package edu.hw2.chapter2;


public class CyclesAndBranching {

    private static int[] fillUpTheArray() {
        int[] array = new int[67];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + ((int) (Math.random() * 10));
        }
        return array;
    }

    private static int[] prepareArrayWithNilsInsteadOfNumbersWithSpecificCondition(int p, int q, int[] array) {
        for (int i = 0; i < startArray.length; i++) {
            if (startArray[i] % p == q) {
                startArray[i] = 0;
            }
        }
        return startArray;
    }

    private static void task184() {
        private int[] startArray = fillUpTheArray();
        private int p = (int) (Math.random() * 10);
        private int q = (int) (Math.random() * 10);
        System.out.print("Starting array --> ");
        for (int item : startArray) {
            System.out.print(item + " ");
        }
        int[] array = prepareArrayWithNilsInsteadOfNumbersWithSpecificCondition(p, q, startArray);
        System.out.print("\nArray with nils instead of numbers, modulus of the division on "
                + p + " of which gives in the remainder " + q + " -->");
        for (int item : array) {
            System.out.print(" " + item);
        }
    }

    public static void main(String[] args) {
        task184();
    }
}
