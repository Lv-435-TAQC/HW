package Utils;

import java.util.Scanner;

public class ConsoleReader {
   private static Scanner in = new Scanner(System.in);
    static String readString(){
        return in.nextLine();
    }
    static Integer readInt(){
        return  in.nextInt();
    }
}
