package utils;


import chapter1.CyclesAndBranching;
import chapter1.NestedLoops;
import chapter1.SimpleLoops;
import chapter2.Integers;

import java.util.ArrayList;
import java.util.List;

public class RunTasks {


    public static void menu() {
        boolean check = true;
        do {
            System.out.println("Write number of task");
            switch (ConsoleReader.readString().toLowerCase()) {
                case "88b":
                    start88b();
                    break;

                case "86h":
                    runTask86h();
                    break;

//            case "86b":
//                start86b();
//                break;
//
//            case "108":
//                start108();
//                break;

                case "178h":
                    start178h();
                    break;

                case "184":
                    start184();
                    break;

                case "242":
                    start242();
                    break;

                case "243a":
                    start243a();
                    break;

                case "331a":
                    start331a();
                    break;

                case "561":
                    start561();
                    break;


                case "87":
                    start87();
                    break;

                case "178b":
                    start178b();
                    break;

                case "226":
                    start226();
                    break;

                case "329":
                    start329();
                    break;

                case "559":
                    start559();
                    break;

                case "88a":
                    start88a();
                    break;

                case "225":
                    start225();
                    break;

                case "227":
                    start227();
                    break;

                case "178v":
                    start178v();
                    break;

                case "330":
                    start330();
                    break;

                case "560":
                    start560();
                    break;

                case "569":
                    start569();
                    break;

                case "exit":
                    check = false;
                    break;

                default:
                    System.out.println("You write invalid number");
            }
        } while (check);
    }

    private static void start87() {
        int n, m;
        System.out.println("Please write two integers:");
        n = Integer.parseInt(ConsoleReader.readInteger());
        m = Integer.parseInt(ConsoleReader.readInteger());
        System.out.println("Task 87 with two arguments n = " + n + ", m = " + m + ", result = " + SimpleLoops.task87(n, m));
    }

    private static void start178b() {
        System.out.println("Please integers:");
        System.out.println("Task 178b with your array, result = " + CyclesAndBranching.task178b(ConsoleReader.integersForArray()));
    }

    private static void start226() {
        int n, m;
        System.out.println("Please write two integers:");
        n = Integer.parseInt(ConsoleReader.readInteger());
        m = Integer.parseInt(ConsoleReader.readInteger());
        System.out.println("Task 226 with two arguments n = " + n + ", m = " + m + ", result = " + CyclesAndBranching.task226(n, m));
    }

    private static void start329() {
        int n, m;
        System.out.println("Please write two integers:");
        n = Integer.parseInt(ConsoleReader.readInteger());
        m = Integer.parseInt(ConsoleReader.readInteger());
        System.out.println("Task 329 with two arguments n = " + n + ", m = " + m + ", result = " + NestedLoops.task329(n, m));
    }

    private static void start559() {
        int n, m;
        System.out.println("Please  integer:");
        n = Integer.parseInt(ConsoleReader.readInteger());
        System.out.println("Task 559 with two arguments n = " + n + ", result = " + Integers.task559(n));
    }

    private static void start88b() {
        System.out.println("Pls write number");
        System.out.println(SimpleLoops.task88b(Integer.parseInt(ConsoleReader.readInteger())) + " is reloaded number! ");
    }

    private static void runTask86h() {
        final String number = ConsoleReader.readPositiveInteger();
        System.out.println("The sum of digits with consecutive sings of the number " + number + " is "
                + SimpleLoops.task86h(number));
    }


    public static void runTask86b() {
        int n = ConsoleReader.ReadNumber();
        if (n > 0) {
            System.out.println(" Sum numbers is " + SimpleLoops.task86b(n));
        } else {
            System.out.println("Not natural number");
        }

    }

    private static void start178h() {
        System.out.println(CyclesAndBranching.task178h(ConsoleReader.integersForArray()) + " numbers are relevant! ");
    }


    private static void runTask108() {
        int n = ConsoleReader.ReadNumber();
        if (n > 0) {
            System.out.println("The smallest number of appearance 2^r>n " + SimpleLoops.task108(n));
        } else {
            System.out.println("Not natural number");
        }
    }

    private static void start561() {
        System.out.println("Pls write number");
        System.out.println(Integers.task561(Integer.parseInt(ConsoleReader.readInteger())) + " are relevant numbers! ");
    }

    static void start243a() {
        System.out.println("Pls write number");
        CyclesAndBranching.task243a(Integer.parseInt(ConsoleReader.readInteger()));
    }

    private static void start331a() {
        System.out.println("Pls write number");
        System.out.println(NestedLoops.task331a(Integer.parseInt(ConsoleReader.readInteger())) + " are couple of relevant numbers! ");
    }

    private static void start242() {
        CyclesAndBranching.task242(3);
    }

    private static void start88a() {
        System.out.println("Pls write number");
        System.out.println(SimpleLoops.task88a(Integer.parseInt(ConsoleReader.readInteger())));
    }

    private static void start225() {
        int n = ConsoleReader.ReadNumber();
        if (n > 0) {
            CyclesAndBranching.task225(n);
        } else {
            System.out.println("Not natural number");
        }

    }

    static void start227() {
        System.out.println("Pls write 2 numbers");
        int firstNum = ConsoleReader.ReadNumber();
        int secondNum = ConsoleReader.ReadNumber();
        CyclesAndBranching.task227(firstNum, secondNum);
    }

    static void start178v() {
        CyclesAndBranching.task178v();
    }

    private static void start330() {
        List<Integer> listOfPerfectNumbers = new ArrayList();
        int number = ConsoleReader.ReadNumber();
        for (int i = 1; i < number; i++) {
            if (NestedLoops.task330(i) == i)
                listOfPerfectNumbers.add(i);
        }
        System.out.println(listOfPerfectNumbers);
    }

    private static void start560() {
        int firstNum = 0;
        int secondNum = 0;
        for (int i = 200; i <= 300; i++) {
            firstNum = Integers.task560(i);
            secondNum = Integers.task560(firstNum);
            if (i == secondNum)
                System.out.println(i + " " + secondNum);
        }
    }


    private static void start569() {
        System.out.println(Integers.task569(Integer.parseInt(ConsoleReader.readPositiveInteger())));
    }

    private static void start184() {
        CyclesAndBranching.task184();
    }
}
