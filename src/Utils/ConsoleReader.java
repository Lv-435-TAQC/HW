package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReader {
   private static Scanner in = new Scanner(System.in);
    static String readString(){
        return in.nextLine();
    }
    static Integer readInt(){
        return  in.nextInt();
    }

    public static String readPositiveInteger() {
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
    public static int ReadNumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, please input number");
        int n = 0;
        try {
            n = keyboard.nextInt();
        } catch (Exception e) {
            System.out.println("This is not a number");
            System.exit(1);
        }
        return n;
    }
}
