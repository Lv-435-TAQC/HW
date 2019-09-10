package Chapter2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class N_178B {

    public void sqrt(){
        List<Integer> nums = Arrays.asList(16,4,55,81,100,25,223);
        List<Integer> list = nums.stream().filter(num->Math.sqrt(num)%2==0).collect(Collectors.toList());
        System.out.println(list.size());
    }
}
