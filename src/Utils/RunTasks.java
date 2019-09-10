package Utils;

import Chapter1.SimpleLoops;

import java.util.Scanner;

public class RunTasks {


    public static void menu() {
        System.out.println("Write number of task");
        switch (ConsoleReader.readString().toLowerCase()) {
            case "88b":
                System.out.println(start88b() + " is reloaded number! ");
            case "86h":
                runTask86h();
            case "86b":
                System.out.println(start86b() + "  is sum of numbers! ");
        }
    }

    static int start88b() {
        System.out.println("Pls write number");
        return SimpleLoops.task88b(ConsoleReader.readInt());
    }

    private static void runTask86h() {
        final String number = ConsoleReader.readPositiveInteger();
        System.out.println("The sum of digits with consecutive sings of the number " + number + " is "
                + SimpleLoops.task86h(number));
    }

    public static int runTask86b() {
      int n=ConsoleReader.ReadNaturalNumber();
        if(n>0)
        {
        return SimpleLoops.task86b(n)
        }
        else
        {
            System.out.println("Not natural number");
        }

    }
}
