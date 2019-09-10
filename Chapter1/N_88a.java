package Chapter1;

import java.util.stream.Stream;

public class N_88a {
    public void findNumber(int num){
        int pow = (int) Math.pow(num, 2);
        String str = Integer.toString(pow);
        System.out.println((str.indexOf('3') != -1) ? "With 3" : "Without 3");

    }
}

