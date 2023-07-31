package Normal;
import java.util.*;

public class deepnashu {
    public static void main(String[]args){
        HashMap<Integer,Integer> map = new HashMap<>();

        int a[] = {1,2,3,4,4,5,6};
        for(int i : a){
            if(!map.containsKey(i)) map.put(i, 1);
            else map.put(i,map.get(i)+1);
        }
        func(map);
    }

    public static void func(HashMap<Integer,Integer> map){
        for(int i : map.keySet()){
            if(map.get(i)==2) System.out.println(i);
        }
    }
}
