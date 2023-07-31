package Normal;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.BitSet;
import java.util.*;
public class Bitset {
    public static void main(String[]args){
        // BitSet obj = new BitSet(5);
        // for(int i=0;i<5;++i){
        //     obj.set(i);
        // }
        // obj.clear(2);
        // System.out.println(obj);
        // Test obj = new Test();
        // obj.func(5);
        // Runnable obj = ()->{
        //     System.out.println("Tricky example");
        // };

        Optional<String> opt = Optional.ofNullable(null);
        System.out.println(opt.isPresent());
        System.out.println(Optional.empty().equals(opt));
    }
}
class Test{
    public void func(int i){
       System.out.println("haha");
    }

    public void func(long i){
        System.out.println("haho");
     }
}
