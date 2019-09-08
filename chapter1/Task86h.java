package edu.hw2.chapter1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task86h {

    private static String inputNumber() {
        final InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        final BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String result = "";
        do {
            System.out.println("Enter the correct number");
            try {
                result = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (result.substring(0, 1).equals("-") || !isNumeric(result));
        return result;
    }

    private static boolean isNumeric(final String string) {
        boolean result = true;
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException | NullPointerException exception) {
            result = false;
        }
        return result;
    }

    private static int findSumOfNumberDigitsWithConsecutiveSigns(final String number) {
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

    public static void main(String[] args) {
        final String number = inputNumber();
        System.out.println("The sum of digits with consecutive sings of the number " + number + " is "
                + findSumOfNumberDigitsWithConsecutiveSigns(number));
    }
}
