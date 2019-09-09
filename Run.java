import Chapter4.EightyEightB;
import Chapter7.OneHundredSeventyEightH;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    private static Scanner in = new Scanner(System.in);

    static void menu() {
        System.out.println("Write number of task");
        switch (in.nextLine().toLowerCase()) {
            case "178h":
                System.out.println(start178h() + " numbers are relevant! ");
        }
    }

    static int start178h() {
        System.out.println("Pls write how many number you want to check");
        int size = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Write number");
            a.add(in.nextInt());
        }
        return OneHundredSeventyEightH.calculate(a);
    }
}
