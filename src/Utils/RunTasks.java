package Utils;

import Chapter1.CyclesAndBranching;
import Chapter1.SimpleLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class RunTasks {


    public static void menu() {
        System.out.println("Write number of task");
        switch (ConsoleReader.readString().toLowerCase()) {
            case "88b":
                start88b();
            case "86h":
                runTask86h();

            case "86b":
                System.out.println(start86b() + "  is sum of numbers! ");

            case "178h":
                start178h();
        }
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


    public static int runTask86b() {
        int n = ConsoleReader.ReadNaturalNumber();
        if (n > 0) {
            return SimpleLoops.task86b(n)
        } else {
            System.out.println("Not natural number");
        }

        private static void start178h () {
            System.out.println("Pls write how many number you want to check");
            int size = ConsoleReader.readInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                System.out.println("Write number");
                a.add(ConsoleReader.readInt());
            }
            System.out.println(CyclesAndBranching.task178h(a) + " numbers are relevant! ");


        }
    }
