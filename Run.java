import Chapter4.EightyEightB;
import Chapter7.OneHundredSeventyEightH;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    private static Scanner in = new Scanner(System.in);

    static void menu() {
        System.out.println("Write number of task");
        switch (in.nextLine().toLowerCase()) {
            case "88b":
                System.out.println(start88b() + " is reloaded number! ");
        }
    }

    static int start88b() {
        System.out.println("Pls write number");
        return EightyEightB.reorder(in.nextInt());
    }
}
