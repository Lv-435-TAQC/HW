package Chapter1;

public class CyclesAndBranching {
    public static int task178b(int[] array) {
        int count = 0;
        for(int item : array){
            if((item % 3 == 0) && (item % 5 != 0)){
                count ++;
            }
        }
        return count;
    }
}
