package Chapter1;

public class SimpleLoops {
    public static int task88b(Integer n) {
        String change = new StringBuffer(Integer.toString(n)).reverse().toString();
        return n = Integer.parseInt(change);
    }

    public static int task86h(final String number) {
        int result = 0;
        char[] digits = number.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                result += Integer.parseInt(String.valueOf(digits[i]));
            } else {
                result -= Integer.parseInt(String.valueOf(digits[i]));
            }
        }
        return result;
    }

    public static double task86b(int n) {
        int res = 0;
        while (n > 0) {
            int a = n % 10;
            res += a;
            n = (n - a) / 10;
        }
        return res;
    }

}
