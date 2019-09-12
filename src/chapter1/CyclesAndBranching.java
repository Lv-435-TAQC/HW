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

    public static ArrayList<Integer> task225(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++) {
            if ((n % (i * i) == 0) && (n % (i * i * i) != 0)) {
                a.add(i);
            }
        }
        return a;
    }

    public static double task242(final int n) {
        double result = 0;
        double k = 0;
        for (int i = (int) k; i <= n; i++) {
            k = i;
            result += Math.pow(-1, k * (k - 1) / 2) / utils.Util.factorial((int) k);
        }
        return result;
    }

    public static int task227(int a, int b) {
        int res = 0;
        for (int i = 1; i <= 40; i++) {
            if ((a % i == 0) && (b % i == 0))
                res = i;
        }
        return res;
    }

    public static int task178v() {
        List<Integer> integerList = Arrays.asList(3, 5, 36, 24, 100, 77);
        List<Integer> list = integerList.stream().filter(num -> Math.sqrt(num) % 2 == 0).collect(Collectors.toList());
        return list.size();
    }

    public static void task184(final int p, final int q, final int[] startArray) {
        System.out.print("Starting array --> ");
        for (int item : startArray) {
            System.out.print(item + " ");
        }
        int[] array = Util.prepareArrayWithNilsInsteadOfNumbersWithSpecificCondition(startArray, p, q);
        System.out.print("\nArray with nils instead of numbers, modulus of the division on "
                + p + " of which gives in the remainder " + q + " -->");
        for (int item : array) {
            System.out.print(" " + item);
        }
        System.out.println();
    }

    public static Map task243b(int a) {
        Map<Integer,Integer> couple = new HashMap();
        for (int i=0; i<=a;i++){
            for (int j=0;j<a;j++){
                if (Math.pow(i,2)+Math.pow(j,2)==a){
                    if (i>=j)
                        System.out.println(i+" "+j);
                    couple.put(i,j);

                }
            }
        }
        return couple;
    }


        public static ArrayList task224(int n){
            ArrayList array = new ArrayList();
            int num = 1;
            while(num <= n){
                if(n%num == 0) {
                    array.add(num);
                }
                num++;
            }
            return array;
        }
    }


