package Task5;

public class N_560 {

    public void getFriendNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            int a = getSum(i);
            int b = getSum(a);
            if(i == b)
                System.out.println(a+" "+ b);

        }
    }
    public int getSum(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if(number % i == 0) sum+=i;
        }
        return sum;

    }
}
