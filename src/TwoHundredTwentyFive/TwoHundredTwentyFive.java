package TwoHundredTwentyFive;

public class TwoHundredTwentyFive {
    int n;
    public TwoHundredTwentyFive(int n) {
        this.n = n;
    }

    public void GetNumber(int n) {
        boolean isTrue = false;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if ((n % (i * i) == 0) && (n % (i * i * i) != 0)) {
                isTrue = true;
                System.out.println(" This q is " + i);
            }
        }
        if (isTrue == false) {
            System.out.println("There is not this numbers");
        }
    }
}
