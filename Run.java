import Chapter7.TwoHundredFortyThreeA;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    private static Scanner in = new Scanner(System.in);

    static void menu() {
        System.out.println("Write number of task");
        switch (in.nextLine().toLowerCase()) {
            case "243a":
                System.out.println(start243a() + " are couple of relevant numbers! ");
        }
    }

    static ArrayList<Integer> start243a() {
        System.out.println("Pls write number");
        return TwoHundredFortyThreeA.isRepresentable(in.nextInt());
    }
}
