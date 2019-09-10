package Utils;


import Chapter1.CyclesAndBranching;
import Chapter1.NestedLoops;
import Chapter1.SimpleLoops;
import Chapter2.Integers;

import java.util.ArrayList;

public class RunTasks {


    public static void menu() {
        System.out.println("Write number of task");
        switch (ConsoleReader.readString().toLowerCase()) {
            case "88b":
                start88b();

            case "86h":
                runTask86h();

//            case "86b":
//                start86b();
//
//            case "108":
//                start108();

            case "178h":
                start178h();

            case "242":
                start242();

            case "243a":
                start243a();

            case "331a":
                start331a();

            case "561":
                start561();


            case "87":
                start87();

            case "178b":
                start178b();

            case "226":
                start226();

            case "329":
                start329();

            case "559":
                start559();

            case "88a":
                start88a();

            case "225":
                start225();

            case "exit":
                break;

            default:
                System.out.println("You write invalid number");
        }
    }

    private static void start87() {
        int n,m;
        System.out.println("Please write two integers:");
        n = Integer.parseInt( ConsoleReader.readInteger());
        m = Integer.parseInt( ConsoleReader.readInteger());
        System.out.println("Task 87 with two arguments n = " + n + ", m = " + m + ", rezult = " + SimpleLoops.task87(n,m));
    }
    private static void start178b() {
        System.out.println("Please integers:");
        System.out.println("Task 178b with your array, rezult = " + CyclesAndBranching.task178b(ConsoleReader.integersForArray()));
    }
    private static void start226() {
        int n,m;
        System.out.println("Please write two integers:");
        n = Integer.parseInt( ConsoleReader.readInteger());
        m = Integer.parseInt( ConsoleReader.readInteger());
        System.out.println("Task 226 with two arguments n = " + n + ", m = " + m + ", rezult = " + CyclesAndBranching.task226(n,m));
    }
    private static void start329() {
        int n,m;
        System.out.println("Please write two integers:");
        n = Integer.parseInt( ConsoleReader.readInteger());
        m = Integer.parseInt( ConsoleReader.readInteger());
        System.out.println("Task 329 with two arguments n = " + n + ", m = " + m + ", rezult = " + NestedLoops.task329(n,m));
    }
    private static void start559() {
        int n,m;
        System.out.println("Please  integer:");
        n = Integer.parseInt( ConsoleReader.readInteger());
        System.out.println("Task 559 with two arguments n = " + n + ", rezult = " + Integers.task559(n));
    }

    private static void start88b() {
        System.out.println("Pls write number");
        System.out.println(SimpleLoops.task88b(ConsoleReader.readInt()) + " is reloaded number! ");
    }

    private static void runTask86h() {
        final String number = ConsoleReader.readPositiveInteger();
        System.out.println("The sum of digits with consecutive sings of the number " + number + " is "
                + SimpleLoops.task86h(number));
    }


    public static void runTask86b() {
        int n = ConsoleReader.ReadNumber();
        if (n > 0) {
//            System.out.println(" Sum numbers is " + SimpleLoops.task86b(n));
        } else {
            System.out.println("Not natural number");
        }

 //       return n;
    }

    private static void start178h() {
        System.out.println("Pls write how many number you want to check");
        int size = ConsoleReader.readInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Write number");
            a.add(ConsoleReader.readInt());
        }
        System.out.println(CyclesAndBranching.task178h(a) + " numbers are relevant! ");
    }

    private static void start243a() {
        System.out.println("Pls write number");
        CyclesAndBranching.task243a(ConsoleReader.readInt());
    }

    private static void start331a() {
        System.out.println("Pls write number");
        System.out.println(NestedLoops.task331a(ConsoleReader.readInt()) + " are couple of relevant numbers! ");
    }
        return n;


    private static void runTask108() {
        int n = ConsoleReader.ReadNumber();
        if (n > 0) {
            System.out.println("The smallest number of appearance 2^r>n " + SimpleLoops.task108(n));
        } else {
            System.out.println("Not natural number");
        }
    }

    private static void start178h() {
        System.out.println("Pls write how many number you want to check");
        int size = ConsoleReader.readInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Write number");
            a.add(ConsoleReader.readInt());
        }
        System.out.println(CyclesAndBranching.task178h(a) + " numbers are relevant! ");

    }

    private static void start561() {
        System.out.println("Pls write number");
        System.out.println(Integers.task561(ConsoleReader.readInt()) + " are relevant numbers! ");
    }

    static void start243a() {
        System.out.println("Pls write number");
        CyclesAndBranching.task243a(ConsoleReader.readInt());
    }

    private static void start331a() {
        System.out.println("Pls write number");
        System.out.println(NestedLoops.task331a(ConsoleReader.readInt()) + " are couple of relevant numbers! ");
    }

    private static void start242() {
        CyclesAndBranching.task242(3);
    }

    private static void start88a() {
        System.out.println("Pls write number");
        System.out.println(SimpleLoops.task88a(ConsoleReader.readInt()));
    }

    private static void start225() {
        int n = ConsoleReader.ReadNumber();
        if (n > 0) {
            CyclesAndBranching.task225(n);
        } else {
            System.out.println("Not natural number");
        }

    }

}
