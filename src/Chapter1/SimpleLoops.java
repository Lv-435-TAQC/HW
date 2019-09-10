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

    public static int task86b(int n) {
        int res = 0;
        while (n > 0) {
            int a = n % 10;
            res += a;
            n = (n - a) / 10;
        }
        return res;
    }

  public static int task87(int n, int m) {
        int sum = 0;
        for (; m > 0 && n != 0; m--) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public int task108(int n) {
        if (Math.pow(2, (Math.log(n) / Math.log(2))) == n) {
            return (Math.log(n) / Math.log(2));
        } else {
            return (Math.log(n) / Math.log(2)) + 1;
        }
    }
}
