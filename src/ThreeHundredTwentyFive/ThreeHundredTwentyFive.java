package ThreeHundredTwentyFive;

public class ThreeHundredTwentyFive {
    int n;
    public ThreeHundredTwentyFive(int n) {
        this.n = n;
    }

    public void GetSimpleNumber(int n) {
        boolean isTrue = false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0 && IsSimple(i)) {
                isTrue = true;
                System.out.println("Number is " + i);
            }
        }
        if (isTrue == false) {
            System.out.println("There are no prime numbers here");
        }
    }

    public  boolean IsSimple(int N) {
        for (int i = 2; i <= Math.sqrt(N); i++)
            if (N % i == 0)
                return false;
        return true;
    }
}