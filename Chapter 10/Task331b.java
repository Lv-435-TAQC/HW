package chapter1;

import java.util.List;

public class NestedLoops {
    public static void findNums(int a){
        for (int i=1;i<Math.sqrt(a);i++){
            for(int j=1;j<i;j++){
                for(int k=1;k<j;k++){
                    int sum = (int) (Math.pow(i,2)+Math.pow(j,2)+Math.pow(k,2));
                    if(sum==a)
                        System.out.println(i+" "+j+" "+k);
                }
            }
        }
    }
}
