package utils;


import chapter1.CyclesAndBranching;
import chapter1.NestedLoops;
import chapter1.SimpleLoops;
import chapter2.Integers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RunTasks {
    private static ConsoleReader consoleReader = new ConsoleReader(new BufferedReader(new InputStreamReader(System.in)));
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
                case "182":
                    start182();
                    break;

                case "241":
                    start241();
                    break;

                case "332":
                    start332();
                    break;

                case "88g":
                    start88g();
                    break;


                case "88v":
                    start88v();
                    break;

                case "555":
                    start555();
                    break;

                case "178d":
                    start178d();
                    break;

                case "567":
                    start567();
                    break;

                case "331b":
                    start331b();
                    break;

                case "562":
                    start562();
                    break;


                default:
                    System.out.println("You write invalid number");
            }
        } while (check);
    }

    private static void start87() {
        int n, m;
        System.out.println("Please write two integers:");
        n = consoleReader.readInteger();
        m = consoleReader.readInteger();
        System.out.println("Task 87 with two arguments n = " + n + ", m = " + m + ", result = " + SimpleLoops.task87(n, m));
    }

    private static void start178b() {
        System.out.println("Please integers:");
        System.out.println("Task 178b with your array, result = " + CyclesAndBranching.task178b(ConsoleReader.integersForArray()));
    }

    private static void start226() {
        int n, m;
        System.out.println("Please write two integers:");
        n = consoleReader.readInteger();
        m = consoleReader.readInteger();
        System.out.println("Task 226 with two arguments n = " + n + ", m = " + m + ", result = " + CyclesAndBranching.task226(n, m));
    }

    private static void start329() {
        int n, m;
        System.out.println("Please write two integers:");
        n = consoleReader.readInteger();
        m = consoleReader.readInteger();
        System.out.println("Task 329 with two arguments n = " + n + ", m = " + m + ", result = " + NestedLoops.task329(n, m));
    }

    private static void start559() {
        int n;
        System.out.println("Please  integer:");
        n = consoleReader.readInteger();
        System.out.println("Task 559 with argument n = " + n + ", result = " + Integers.task559(n));
    }

    private static void start88b() {
        System.out.println("Pls write number");
        System.out.println(SimpleLoops.task88b(consoleReader.readInteger()) + " is reloaded number! ");
    }

    private static void runTask86h() {
        final int number = Integer.parseInt(consoleReader.readPositiveInteger());
        System.out.println("The sum of digits with consecutive sings of the number " + number + " is "
                + SimpleLoops.task86h(number));
    }

    private static void start86b() {
        System.out.println("Sum of numbers is  " + SimpleLoops.task86b(consoleReader.readInteger()));
    }

    private static void start178h() {
        System.out.println(CyclesAndBranching.task178h(consoleReader.readInteger() +consoleReader.integersForArray()) + " numbers are relevant! ");
    }

    private static void start108() {
        System.out.println("The smallest number of appearance 2^r>n is  "
                + SimpleLoops.task108(consoleReader.readInteger()));
    }

    private static void start561() {
        System.out.println("Pls write number");
        System.out.println(Integers.task561(consoleReader.readInteger()) + " are relevant numbers! ");
    }

    static void start243a() {
        System.out.println("Pls write number");
        CyclesAndBranching.task243a(consoleReader.readInteger());
    }

    private static void start331a() {
        System.out.println("Pls write number");
        System.out.println(NestedLoops.task331a(consoleReader.readInteger()) + " are couple of relevant numbers! ");
    }

    private static void start242() {
        System.out.println(CyclesAndBranching.task242(Integer.parseInt(consoleReader.readPositiveInteger())));
    }

    private static void start88a() {
        System.out.println("Pls write number");
        System.out.println(SimpleLoops.task88a(consoleReader.readInteger()));
    }

    private static void start225() {
        System.out.println("This q is " + CyclesAndBranching.task225(consoleReader.readInteger()));
    }

    static void start227() {
        System.out.println("Pls write 2 numbers");
        int firstNum = consoleReader.readInteger();
        int secondNum = consoleReader.readInteger();
        CyclesAndBranching.task227(firstNum, secondNum);

    }

    static void start178v() {
        CyclesAndBranching.task178v();
    }

    private static void start330() {
        int number = consoleReader.readInteger();
        NestedLoops.task330(number);
    }

    private static void start560() {
        System.out.println(Integers.task560());
    }

    private static void start86a() {
        System.out.println("Please write number");
        System.out.println(SimpleLoops.task86a(consoleReader.readInteger()) + " is digits of numbers! ");
    }

    private static void start569() {
        System.out.println(Integers.task569(Integer.parseInt(consoleReader.readPositiveInteger())));
    }

    private static void start184() {
        System.out.println("p");
        final int p = Integer.parseInt(consoleReader.readPositiveInteger());
        System.out.println("q");
        final int q = Integer.parseInt(consoleReader.readPositiveInteger());
        System.out.print("The array with nils instead of digits, modulus of which gives in remainder " + q
                + "\nduring the division on " + p + " is -->");
        Util.writeIntArrayToConsole(CyclesAndBranching.task184(p, q, Util.fillUpTheArray(67)));
    }

    private static void start340() {
        System.out.println("m");
        final int m = Integer.parseInt(consoleReader.readPositiveInteger());
        int[] resultArray = NestedLoops.task340(m, Util.fillUpTheArray(20));
        if (resultArray == null) {
            System.out.println("\nThere are no three indexes which can satisfy the conditions with m = " + m);
        } else {
            System.out.print("\nThe three indexes (i, j, k) which can satisfy the equation a(i) + a(j) + a(k) = " + m
                    + " are -->");
            Util.writeIntArrayToConsole(resultArray);
        }
    }

    private static void start107() {
        System.out.println("Please write a number");
        System.out.println(SimpleLoops.task107(consoleReader.readInteger()) + " is a pow of 4! ");
    }

    private static void start224() {
        System.out.println("Please write a number");
        System.out.println(CyclesAndBranching.task224(consoleReader.readInteger()) + " is natural dividers of your number");
    }

    private static void start243b() {
        System.out.println(CyclesAndBranching.task243b(consoleReader.readInteger()));
    }

    private static void start331b() {
        System.out.println(NestedLoops.task331b(consoleReader.readInteger()));
    }

    private static void start323() {
        System.out.println("Please write a number");
        System.out.println(NestedLoops.task323(consoleReader.readInteger()) + " is relatively simple numbers to yours ");
    }

    private static void start554() {
        System.out.println("Please write a number");
        System.out.println(Integers.task554(consoleReader.readInteger()) + " is Pythagorean triples");
    }

    private static void start325() {
        System.out.println("Prime divisors of a number is " + NestedLoops.task325(consoleReader.readInteger()));
    }

    private static void start555() {
        int n = consoleReader.readInteger();
        int[][] triangle = Integers.task555(n);
        Util.showPascalTriangle(n, triangle);
    }

    public static void start182() {
        int sum = 0;
        int counter = 0;

        CyclesAndBranching.task182(sum, counter);
    }

    public static void start241() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter positive integer number");
        int n = scan.nextInt();
        double sum = 0;
        if (n <= 0) {
            System.out.println("You entered invalid number");
        }
        System.out.println("Enter any number");
        int x = scan.nextInt();

        CyclesAndBranching.task241(sum, n, x);
    }

    public static void start332() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter natural number");
        int n = scan.nextInt();

        NestedLoops.task332(n);
    }

    public static void start88g() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter natural number");
        int n = scan.nextInt();
        String strvalue = Integer.toString(n);

        SimpleLoops.task88g(strvalue);
    }

    private static void start88v() {
        System.out.println("Please enter your number");
        System.out.println(SimpleLoops.task88v(consoleReader.readInteger()) + " is number with reversed first and last item");
    }

    private static void start178d() {
        System.out.println(CyclesAndBranching.task178d(consoleReader.readInteger()) + " numbers are relevant! ");
    }

    public static void start567() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any positive integer number");
        int n = scan.nextInt();
        Integers.task567(n);
    }

    private static void start562() {
        System.out.println(Integers.task562(consoleReader.readInteger()));
    }


}
