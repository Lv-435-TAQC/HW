package Chapter5;

import java.util.ArrayList;
import java.util.List;

public class N_560 {

    public static int getSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0)
                sum+=i;
        }
        return sum;

    }

}
