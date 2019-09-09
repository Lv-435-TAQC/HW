package Chapter4;

public class N_330 {

    public static int getSum(int a){
        int sum= 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0)
                sum+=i;
        }
        return sum;
    }
}

