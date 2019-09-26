package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleReader {
    private static Scanner in = new Scanner(System.in);
    private static BufferedReader bufferedReader = null;

    public ConsoleReader(BufferedReader br) {
        bufferedReader = br;
    }

    static String readString() {
        return in.nextLine();
    }

    public static boolean isInteger(String string) {
        boolean result = true;
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException | NullPointerException exception) {
            System.out.println("Your number is incorrect, please try again");
            result = false;
        }
        if (result == true && Integer.parseInt(string) < 0) {
            result = false;
            System.out.println("Your number is incorrect, please try again");
        }
        return result;
    }

    public static ArrayList<Integer> integersForArray() {
        ArrayList<Integer> array = new ArrayList<>();
        String result = "";
        do {
            System.out.println("Enter integer ('/' char - end of numbers)");
            try {
                result = bufferedReader.readLine();
                if (result.contentEquals("/"))
                    continue;
                if (isInteger(result)) {
                    array.add(Integer.valueOf(result));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!result.contentEquals("/"));
        return array;
    }

    public int readInteger() {
        String result = "";
        do {
            System.out.println("Enter integer");
            try {

                result = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!isInteger(result));
        return Integer.parseInt(result);
    }
}
