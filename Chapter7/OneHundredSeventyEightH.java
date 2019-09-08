package Chapter7;

import java.util.ArrayList;

public class OneHundredSeventyEightH {
    public int calculate(ArrayList<Integer> a){
        for (int i=0;i<a.size();i++){

             if(!(Math.sqrt(a.get(i))%2==0) || a.get(i)==0 ){

                a.remove(i);
                i--;
            }


        }
       return a.size();
    }
}
