package Chapter4;

public class EightyEightB {
   public int reorder(Integer n){
        String change =new StringBuffer(Integer.toString(n)).reverse().toString();

        return n=Integer.parseInt(change);
    }


}
