package chapter1;

import utils.Util;

import java.util.*;
import java.util.stream.Collectors;

public class CyclesAndBranching {
    public static int task178b(ArrayList<Integer> array) {
        int count = 0;
        for (int item : array) {
            if ((item % 3 == 0) && (item % 5 != 0)) {
                count++;
            }
        }
        return count;
    }

    public static LinkedList<Integer> task226(int m, int n) {
        LinkedList<Integer> listMultipleNumbers = new LinkedList<>();
        int max = m * n;
        for (int i = max - 1; i > 0; i--) {
            if ((i % m) == 0 && (i % n) == 0) {
                listMultipleNumbers.add(i);
            }
        }
        return listMultipleNumbers;

    }

    public static ArrayList<Integer> task243a(Integer n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i * i + j * j) == n) {
                    a.add(i);
                    a.add(j);
                }
            }
        }
        return a;
    }

    public static int task178h(ArrayList<Integer> a) {
        for (int i = 1; i < a.size() - 1; i++) {
            if (a.get(i) < (a.get(i - 1) + a.get(i + 1)) / 2) {
                a.remove(i);
                i--;
            }
        }
        return a.size();
    }

    public static List<Integer> task225(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if ((n % (i * i) == 0) && (n % (i * i * i) != 0)) {
               list.add(i);
            }
        }
        return list;
    }

    public static double task242(final int n) {
        double result = 0;
        for (int k = 0; k <= n; k++) {
            result += Math.pow(-1, k * (double)(k - 1) / 2) / utils.Util.factorial(k);
        }
        return result;
    }

    public static List<Integer> task227(int a, int b) {
        List<Integer> list = new ArrayList();
        if (a>b){
            for (int i = -a; i <= a; i++) {
                if (i != 0) {
                    if ((a % i == 0) && (b % i == 0))
                        list.add(i);
                }
            }
        }
        else{
            for (int i = -b; i <= b; i++) {
                if (i != 0) {
                    if ((a % i == 0) && (b % i == 0))
                        list.add(i);
                }
            }
        }
        return list;
    }

    public static int task178v() {
        List<Integer> integerList = Arrays.asList(3, 5, 36, 24, 100, 77);
        List<Integer> list = integerList.stream().filter(num -> Math.sqrt(num) % 2 == 0).collect(Collectors.toList());
        return list.size();
    }

    public static int[] task184(final int p, final int q, final int[] startArray) {
        int[] result = new int[startArray.length];
        for (int i = 0; i < startArray.length; i++) {
            if (startArray[i] % p == q) {
                result[i] = 0;
            } else {
                result[i] = startArray[i];
            }
        }
        return result;
    }

    public static Map task243b(int a) {
        Map<Integer,Integer> couple = new HashMap();
        for (int i=1; i<=a;i++){
            for (int j=1;j<a;j++){
                if (Math.pow(i,2)+Math.pow(j,2)==a){
                    if (i>=j)
                    couple.put(i,j);
                }
            }
        }
        return couple;
    }


    public static ArrayList task224(int n) {
        ArrayList array = new ArrayList();
        int num = 1;
        while (num <= n) {
            if (n % num == 0) {
                array.add(num);
            }
            num++;
        }
        return array;
    }

    public static int task182(int sum, int counter) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(10);
        arr.add(15);
        arr.add(21);

        System.out.println(arr.toString());

        for (Integer i : arr) {
            if (i % 5 == 0 && i % 7 != 0) {

                sum += i;
                counter++;
            }
        }
        System.out.println("The number of operations: " + counter + " \nThe summary of valid numbers:   " + sum);

        return sum + counter;
    }


    public static double task241(double sum, int n, int x) {
        for (int i = 1; i <= n; i++) {
            double part1 = (-1 ^ (int) Math.sqrt(i));
            double part2 = i * x ^ i;
            double devide = part1 / part2;
            sum = sum + devide;

        }
        System.out.println("\n sum is " + sum);
        return sum;
    }

    public static int task178d(int b) {
        int[] armstrongList = new int[b];
        int suma = 0;
        Random random = new Random();

        for (int i = 0; i < armstrongList.length; i++) {
            armstrongList[i] = random.nextInt(200);
        }

        for (int i = 0; i < armstrongList.length; i++) {
            boolean dva2 = Math.pow(2, i) < (armstrongList[i]);
            boolean faktorial = armstrongList[i] < (Util.factorial(i));

            if (dva2 && faktorial) {
                suma++;
            }
        }
        return suma;
    }

}


