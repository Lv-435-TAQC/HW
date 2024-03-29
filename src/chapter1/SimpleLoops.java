package chapter1;

public class SimpleLoops {
    /**
     * We need to reverse number
     *
     * @param n - it`s number what we will reverse
     * @return reversed number Integer type
     */
    public static int task88b(Integer n) {
        String change = new StringBuffer(Integer.toString(n)).reverse().toString();
        return Integer.parseInt(change);
    }

    /**
     * Finds the sum of all digits of a number with consecutive change of the sign
     * For example, for number 1234 the method will return -2 because 1 - 2 + 3 - 4 = -2
     *
     * @param number number from which we take all the digits and count their sum with consecutive change of the sign.
     * @return sum of all digits with consecutive change of the sign
     */
    public static int task86h(final int number) {
        int result = 0;
        char[] digits = String.valueOf(number).toCharArray();
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

    public static int task108(int n) {
        int res = (int) (Math.log(n) / Math.log(2));
        if (Math.pow(2, res) == n) {
            return (int) Math.pow(2, res);
        } else {
            res += 1;
            return (int) (Math.pow(2, res));
        }
    }

    public static boolean task88a(int num) {
        boolean result = false;
        int pow = (int) Math.pow(num, 2);
        String str = Integer.toString(pow);
        if (str.contains("3"))
            result = true;
        return result;
    }

    public static int task86a(int n) {
        int counter = 0;
        while (n > 1) {
            n = n / 10;
            counter++;
        }
        return counter;
    }

    public static int task107(int m) {
        int k = 0;
        while (Math.pow(4, k) < m) {
            k++;
        }
        return k - 1;
    }

    public static String task88g(String strvalue) {
        String val = "1";
        System.out.println(val + strvalue + val);
        return val + strvalue + val;

    }

    public static int task88v(int number) {
        if (number >= 10) {
            String text = String.valueOf(number);
            String firstItem = text.substring(0, 1);
            String lastItem = text.substring(text.length() - 1);
            String middlePart = text.substring(1, text.length() - 1);
            text = lastItem + middlePart + firstItem;
            number = Integer.parseInt(text);


        } else {
            number = number;
        }
        return number;
    }

}
