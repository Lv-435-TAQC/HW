package Chapter4;

import java.util.ArrayList;
import java.util.List;

public class N_330 {
    public void perfectNumbers(int k) {
        int a;
        List<Integer> list = new ArrayList();
        for (a = 1; a < k; a++) {
            int count = 0;
            for (int i = 1; i < a; i++) {
                if ((a % i == 0))
                    list.add(i);
            }
            for (int j : list) {
                count += j;
            }
            list.clear();
            if (count == a)
                System.out.println(a);
        }


    }
}

