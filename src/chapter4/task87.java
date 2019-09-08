package chapter4;
import creationExaptions.taskExeption;

public class task87  {
    public int sumDigitsOfComplexNumber(int n, int m)throws taskExeption{
        int sum = 0;
        if(m < 1 || n < 1)
            throw new taskExeption("check your digitals, don`t use arguments less then 1");
        for (; m>0 && n != 0;m--){
            sum+=(n % 10);
            n/= 10;
        }
        return sum;
    }
}

