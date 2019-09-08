import PackageEightySixB.*;
import PackageOneHundredEight.*;
import FiveHundredFiftyFive.*;
import ThreeHundredTwentyFive.*;
import TwoHundredTwentyFive.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        boolean isProgram=true;
        while (isProgram)
        {
            Menu();
            System.out.println("Menu: ");
            int change=ReadNumber();
            switch (change)
            {
                case 1:
                {
                    int n = ReadNumber();
                    EightySixB exb=new EightySixB(n);
                    if (n > 0) {
                        System.out.println("Sum of numbers is " + exb.NumberSum(n));
                    } else {
                        System.out.println("Please. input only natural number :) ");
                    }
                }
                break;
                case 2:
                {
                    int n = ReadNumber();
                   OneHundredEight ohe=new OneHundredEight(n);
                    if (n > 0) {
                        System.out.println("Sum of numbers is " + ohe.GetNum(n));
                    } else {
                        System.out.println("Please. input only natural number :) ");
                    }
                }
                break;
                case 3:
                {
                    int n = ReadNumber();
                   TwoHundredTwentyFive thf=new TwoHundredTwentyFive(n);
                    if (n > 0) {
                        thf.GetNumber(n);
                    } else {
                        System.out.println("Please. input only natural number :) ");
                    }
                }
                break;
                case 4:
                {
                    int n = ReadNumber();
                    ThreeHundredTwentyFive tht=new ThreeHundredTwentyFive(n);
                    if (n > 0) {
                        tht.GetSimpleNumber(n);
                    } else {
                        System.out.println("Please. input only natural number :) ");
                    }
                }
                break;
                case 5:
                {
                    int n = ReadNumber();
                  FiveHundredFiftyFive fhf=new FiveHundredFiftyFive(n);
                    if (n > 0) {
                    fhf.doThisTriangle();
                    } else {
                        System.out.println("Please. input only natural number :) ");
                    }
                }
                break;
                case 6:
                {
                  isProgram=false;
                }
                break;
                default:
                {
                    System.out.println("No good select :(");
                }
                break;
            }

        }
    }
    public static void Menu()
    {
        System.out.println("1. Task 86b ");
        System.out.println("2. Task 108 ");
        System.out.println("3. Task 225 ");
        System.out.println("4. Task 325 ");
        System.out.println("5. Task 555 ");
        System.out.println("6. Bye ");
    }
    public static int ReadNumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello, please input number");
        int n = 0;
        try {
            n = keyboard.nextInt();
        } catch (Exception e) {
            System.out.println("This is not a number");
            System.exit(1);
        }
        return n;
    }
}