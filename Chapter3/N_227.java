package Chapter3;

public class N_227 {
    public void func(int a , int b) {
        for (int i = 1; i <= 40; i++) {
            if ((a % i == 0) && (b % i == 0))
                System.out.println(i);
        }
    }
}
