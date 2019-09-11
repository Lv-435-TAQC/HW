package chapter1;

public class CyclesAndBranching {
    public void Task243b(int a){
        for (int i=0; i<=a;i++){
            for (int j=0;j<a;j++){
                if (Math.pow(i,2)+Math.pow(j,2)==a){
                    if (i>=j)
                    System.out.println(i+" "+j);

                }
            }
        }
    }
}
