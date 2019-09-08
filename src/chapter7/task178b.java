package chapter7;
import creationExaptions.taskExeption;

public class task178b {
    public int multiplesOfThreeAndNotMultiplesOfFive (int[] array) throws taskExeption{
        int count = 0;
        if(array.length == 0)throw new taskExeption("your array is empty");
        for(int item : array){
            if((item % 3 == 0) && (item % 5 != 0)){
                System.out.println(item);
                count ++;
            }
        }
        return count;
    }
}
