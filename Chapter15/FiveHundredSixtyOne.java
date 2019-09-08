package Chapter15;

import java.util.ArrayList;

public class FiveHundredSixtyOne {
    public ArrayList<Integer> find(Integer n){
        ArrayList<Integer> a = new ArrayList<>();
        String one,two;
        for (int i=1;i<=n;i++){
            one = Integer.toString(i);
            two = Integer.toString(i*i);
            two = two.substring(two.length()-one.length());
            if(Integer.parseInt(one)==Integer.parseInt(two)){

                a.add(i);
            }
        }
        return a;
    }
}
