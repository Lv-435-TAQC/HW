package utils;

public class Util {

    public static int factorial(final int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean isNumeric(final String string) {
        boolean result = true;
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException | NullPointerException exception) {
            result = false;
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

    public static int[] prepareArrayWithNilsInsteadOfNumbersWithSpecificCondition(int[] startArray, int p, int q) {
        for (int i = 0; i < startArray.length; i++) {
            if (startArray[i] % p == q) {
                startArray[i] = 0;
            }
        }
        return startArray;
    }

    public static int[] findThreeNumbersWithSpecificConditions(int[] startArray, int m) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < 20) {
            if (startArray[i] + startArray[j] + startArray[k] == m) {
                return new int[]{i, j, k};
            }
            if (k < 19) {
                k++;
            } else {
                k = 0;
                j++;
            }
            if (j == 20) {
                j = 0;
                i++;
            }
        }
        return null;
    }

    private static int getTriangleDigitsCount(int value) {
        int maxSize=10000;
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

    public static void showPascalTriangle(int n, int[][] triangle)
    {
        final int linesCount = n;
        int pascalTriangle[][] = triangle;
        for (int level[]: pascalTriangle) {
            System.out.print(getTriangleSpaces(level, getTriangleLineLength(pascalTriangle[linesCount - 1])));
            for (int var: level) {
                if (var != 0) {
                    System.out.print(var + " ");
                }
            }
            System.out.println();
        }
    }
}
