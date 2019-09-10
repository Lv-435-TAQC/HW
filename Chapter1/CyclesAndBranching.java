package edu.hw2.Chapter1;

import edu.hw2.Utils.Util;


public class CyclesAndBranching {

    public static double task242(final int n) {
        double result = 0;
        double k = 0;
        for (int i = (int) k; i <= n; i++) {
            k = i;
            result += Math.pow(-1, k * (k - 1) / 2) / Util.factorial((int) k);
        }
        return result;
    }
}
