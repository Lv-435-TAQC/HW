package chapter4;

public class task87  {
    public static int sumDigitsOfComplexNumber(int n, int m){
        int sum = 0;
        for (; m > 0 && n != 0; m--){
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}

