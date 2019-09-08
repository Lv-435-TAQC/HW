package PackageOneHundredEight;

public class OneHundredEight {
    int n;
    public OneHundredEight(int n) {
        this.n = n;
    }

    public int GetNum(int n) {
        if (Math.pow(2, log(2, n)) == n) {
            return log(2, n);
        } else {
            return log(2, n) + 1;
        }
    }

    public int log(int x, int n) {
        return (int) (Math.log(n) / Math.log(x));
    }
}
