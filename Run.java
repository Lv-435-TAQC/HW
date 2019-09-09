import Chapter10.ThreeHundredThirtyOneA;
import Chapter15.FiveHundredSixtyOne;
import Chapter7.TwoHundredFortyThreeA;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    private static Scanner in = new Scanner(System.in);

    static void menu() {
        System.out.println("Write number of task");
        switch (in.nextLine().toLowerCase()) {
            case "561":{
                System.out.println(start561() + " are relevant numbers! ");}
            case "exit":{
                break;
            }
            default:{
                System.out.println("You write invalid number");
            }
        }
    }

    static ArrayList<Integer> start561() {
        System.out.println("Pls write number");
        return FiveHundredSixtyOne.find(in.nextInt());
    }
}
