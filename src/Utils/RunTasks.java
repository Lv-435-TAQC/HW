package Utils;

import Chapter1.SimpleLoops;

import java.util.Scanner;

public class RunTasks {


    public static void menu() {
        System.out.println("Write number of task");
        switch (ConsoleReader.readString().toLowerCase()) {
            case "88b":
                System.out.println(start88b() + " is reloaded number! ");
        }
    }

    static int start88b() {
        System.out.println("Pls write number");
        return SimpleLoops.task88b(ConsoleReader.readInt());
    }
}
