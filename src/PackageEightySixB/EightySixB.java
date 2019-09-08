package PackageEightySixB;

public class EightySixB {
    int n;

    public EightySixB(int n) {
        this.n = n;
    }

    public double NumberSum(int n) {
        int res = 0;
        while (n > 0) {
            int a = n % 10;
            res += a;
            n = (n - a) / 10;
        }
        return res;
    }
}