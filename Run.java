import Chapter10.ThreeHundredThirtyOneA;
import Chapter7.TwoHundredFortyThreeA;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    private static Scanner in = new Scanner(System.in);

    static void menu() {
        System.out.println("Write number of task");
        switch (in.nextLine().toLowerCase()) {
            case "331a":
                System.out.println(start331a() + " are couple of relevant numbers! ");
        }
    }

    static ArrayList<Integer> start331a() {
        System.out.println("Pls write number");
        return ThreeHundredThirtyOneA.isRepresentable(in.nextInt());
    }
}
