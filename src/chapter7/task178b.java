package chapter7;

public class task178b {
    public static int multiplesOfThreeAndNotMultiplesOfFive (int[] array) {
        int count = 0;
        for(int item : array){
            if((item % 3 == 0) && (item % 5 != 0)){
                count ++;
            }
        }
        return count;
    }
}
