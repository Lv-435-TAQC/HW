package Chapter4;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public List getPerfectNumbers(int k) {
        List list = new ArrayList();
        for (int i = 1; i < k; i++) {
            int sum = N_330.getSum(i);
            if (sum== i)
                list.add(i);
        }
        return list;
    }
}
