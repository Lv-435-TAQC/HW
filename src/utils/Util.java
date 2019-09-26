package utils;

public class Util {

    public static int factorial(final int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int[] fillUpTheArray(final int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + ((int) (Math.random() * 10));
        }
        return array;
    }

    private static int getTriangleDigitsCount(int value) {
        int maxSize = 10000;
        int digitCounter = 1;
        for (int divider = 10; digitCounter < maxSize; digitCounter++, divider *= 10) {
            if (value / divider < 1) {
                break;
            }
        }
        return digitCounter;
    }

    private static int getTriangleLineLength(int line[]) {
        int length = -1;
        for (int value : line) {
            if (value == 0) {
                break;
            }
            length++;
            length += getTriangleDigitsCount(value);
        }
        return length;
    }

    private static String getTriangleSpaces(int line[], int maxLineLength) {
        String spaces = "";
        int spaceCount = maxLineLength - getTriangleLineLength(line);
        spaceCount /= 2;
        for (int i = 0; i < spaceCount; i++) {
            spaces += " ";
        }
        return spaces;
    }

    public static void showPascalTriangle(int n, int[][] triangle) {
        final int linesCount = n;
        int pascalTriangle[][] = triangle;
        for (int level[] : pascalTriangle) {
            System.out.print(getTriangleSpaces(level, getTriangleLineLength(pascalTriangle[linesCount - 1])));
            for (int var : level) {
                if (var != 0) {
                    System.out.print(var + " ");
                }
            }
            System.out.println();
        }
    }

    public static int getSumtoFindPerfectNumbers(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }

    public static void writeIntArrayToConsole(final int[] array) {
        for (int item : array) {
            System.out.print(" " + item);
        }
        System.out.println();
    }

    public static boolean isNaturalPrimeNumber(int number) {
        boolean b = true;
        if (number < 2)
            return false;
        if (number == 2 || number == 3)
            return true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                b = false;
                break;
            }
        }
        return b;
    }
}
