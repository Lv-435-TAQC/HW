package Chapter5;

import java.util.HashMap;
import java.util.Map;

public class Run {
    public Map<Integer, Integer> getFriendsNumbers(int start, int end) {
        Map<Integer,Integer> nums = new HashMap();
        for (int i = start; i <= end; i++) {
            int a = N_560.getSum(i);
            int b = N_560.getSum(a);
            if(i == b)
                nums.put(a,b);
        }
        return nums;
    }
}
