package Chapter1;

import java.util.ArrayList;

public class CyclesAndBranching {

    public static int task178h(ArrayList<Integer> a) {
        for (int i = 1; i < a.size() - 1; i++) {
            if (a.get(i) < (a.get(i - 1) + a.get(i + 1)) / 2) {
                a.remove(i);
                i--;
            }
        }
        return a.size();
    }

    public static void task184() {
        private int[] startArray = Util.fillUpTheArray();
        private int p = (int) (Math.random() * 10);
        private int q = (int) (Math.random() * 10);
        System.out.print("Starting array --> ");
        for (int item : startArray) {
            System.out.print(item + " ");
        }
        int[] array = Util.prepareArrayWithNilsInsteadOfNumbersWithSpecificCondition(p, q, startArray);
        System.out.print("\nArray with nils instead of numbers, modulus of the division on "
                + p + " of which gives in the remainder " + q + " -->");
        for (int item : array) {
            System.out.print(" " + item);
        }
    }
}
