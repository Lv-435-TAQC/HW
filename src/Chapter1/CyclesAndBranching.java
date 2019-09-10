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
    public static ArrayList<Integer> task243a(Integer n) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i * i + j * j) == n) {
                    a.add(i);
                    a.add(j);
                }
            }
        }
        return a;
    }
}
