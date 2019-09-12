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

                case "86b":
                    start86b();
                    break;

                case "108":
                    start108();
                    break;

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

                case "340":
                    start340();
                    break;

                case "560":
                    start560();
                    break;

                case "86a":
                    start86a();
                    break;

                case "569":
                    start569();
                    break;

                case "107":
                    start107();
                    break;

                case "243b":
                    start243b();

                case "224":
                    start224();
                    break;

                case "323":
                    start323();
                    break;

                case "554":
                    start554();
                    break;

                case "exit":
                    check = false;
                    break;

                case "325":
                    start325();
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
        int n;
        System.out.println("Please  integer:");
        n = Integer.parseInt(ConsoleReader.readInteger());
        System.out.println("Task 559 with two arguments n = " + n + ", result = " + Integers.task559(n));
    }

    private static void start88b() {
        System.out.println("Pls write number");
        System.out.println(SimpleLoops.task88b(Integer.parseInt(ConsoleReader.readInteger())) + " is reloaded number! ");
    }

    private static void runTask86h() {
        final int number = Integer.parseInt(ConsoleReader.readPositiveInteger());
        System.out.println("The sum of digits with consecutive sings of the number " + number + " is "
                + SimpleLoops.task86h(number));
    }

    private static void start86b() {
        System.out.println("Sum of numbers is  " + SimpleLoops.task86b(Integer.parseInt(ConsoleReader.readInteger())));
    }

    private static void start178h() {
        System.out.println(CyclesAndBranching.task178h(ConsoleReader.integersForArray()) + " numbers are relevant! ");
    }

    private static void start108() {
        System.out.println("The smallest number of appearance 2^r>n is  "
                + SimpleLoops.task108(Integer.parseInt(ConsoleReader.readInteger())));
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
        System.out.println(CyclesAndBranching.task242(Integer.parseInt(ConsoleReader.readPositiveInteger())));
    }

    private static void start88a() {
        System.out.println("Pls write number");
        System.out.println(SimpleLoops.task88a(Integer.parseInt(ConsoleReader.readInteger())));
    }

    private static void start225() {
        System.out.println("This q is " + CyclesAndBranching.task225(Integer.parseInt(ConsoleReader.readInteger())));
    }

    static void start227() {
        System.out.println("Pls write 2 numbers");
        int firstNum = Integer.parseInt(ConsoleReader.readInteger());
        int secondNum = Integer.parseInt(ConsoleReader.readInteger());
        CyclesAndBranching.task227(firstNum, secondNum);
    }

    static void start178v() {
        CyclesAndBranching.task178v();
    }

    private static void start330() {
        List<Integer> listOfPerfectNumbers = new ArrayList();
        int number = Integer.parseInt(ConsoleReader.readInteger());
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

    private static void start86a() {
        System.out.println("Please write number");
        System.out.println(SimpleLoops.task86a(Integer.parseInt(ConsoleReader.readInteger())) + " is digits of numbers! ");
    }

    private static void start569() {
        System.out.println(Integers.task569(Integer.parseInt(ConsoleReader.readPositiveInteger())));
    }

    private static void start184() {
        System.out.println("p");
        final int p = Integer.parseInt(ConsoleReader.readPositiveInteger());
        System.out.println("q");
        final int q = Integer.parseInt(ConsoleReader.readPositiveInteger());
        CyclesAndBranching.task184(p, q, Util.fillUpTheArray(67));
    }

    private static void start340() {
        System.out.println("m");
        final int m = Integer.parseInt(ConsoleReader.readPositiveInteger());
        NestedLoops.task340(m, Util.fillUpTheArray(20));
    }

    private static void start107() {
        System.out.println("Please write a number");
        System.out.println(SimpleLoops.task107(Integer.parseInt(ConsoleReader.readInteger())) + " is a pow of 4! ");
    }

    private static void start224() {
        System.out.println("Please write a number");
        System.out.println(CyclesAndBranching.task224(Integer.parseInt(ConsoleReader.readInteger())) + " is natural dividers of your number");
    }

    private static void start243b() {
        System.out.println(CyclesAndBranching.task243b(Integer.parseInt(ConsoleReader.readInteger())));
    }

    private static void start331b() {
        System.out.println();
    }

    private static void start323() {
        System.out.println("Please write a number");
        System.out.println(NestedLoops.task323(Integer.parseInt(ConsoleReader.readInteger())) + " is relatively simple numbers to yours ");
    }

    private static void start554() {
        System.out.println("Please write a number");
        System.out.println(Integers.task554(Integer.parseInt(ConsoleReader.readInteger())) + " is Pythagorean triples");
    }

    private static void start325() {
        System.out.println("Prime divisors of a number is " + NestedLoops.task325(Integer.parseInt(ConsoleReader.readInteger())));
    }
}
