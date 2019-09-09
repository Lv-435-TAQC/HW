package Chapter10;

import java.util.ArrayList;

public class ThreeHundredThirtyOneA {
    public ArrayList<Integer> isRepresentable(Integer n) {
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
}
