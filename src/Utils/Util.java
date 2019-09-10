package Utils;


public class Util {

    public static int[] fillUpTheArray() {
        int[] array = new int[67];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + ((int) (Math.random() * 10));
        }
        return array;
    }

    public static int[] prepareArrayWithNilsInsteadOfNumbersWithSpecificCondition(int p, int q, int[] array) {
        for (int i = 0; i < startArray.length; i++) {
            if (startArray[i] % p == q) {
                startArray[i] = 0;
            }
        }
        return startArray;
    }
}