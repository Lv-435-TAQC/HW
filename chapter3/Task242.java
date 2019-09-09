package edu.hw2.chapter3;


public class Task242 {

    private static int factorial(final int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private static double sum(final int n) {
        double result = 0;
        double k = 0;
        for (int i = (int) k; i <= n; i++) {
            k = i;
            result += Math.pow(-1, k * (k - 1) / 2) / factorial((int) k);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
