package Chapter1;

import java.util.ArrayList;
import java.util.LinkedList;

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
    public static LinkedList<Integer> task226 (int m, int n){
        LinkedList<Integer>listMultipleNumbers = new LinkedList<>();
        int max = m * n;
        for(int iter = max - 1; iter > 0; iter--){
            if((iter % m) == 0  && (iter % n) == 0) {
                listMultipleNumbers.add(iter);
            }
        }
        return listMultipleNumbers;
    }
}
