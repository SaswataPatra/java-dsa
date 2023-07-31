package recursion;
import java.util.*;
public class subsets1 {
    public static void main(String[]args){
        int n[]= {3,2,1};
        List<Integer> lst = new ArrayList<>();
        subsets(n,lst,0);
        // System.out.println(lst);
    }

    public static void subsets(int n[], List<Integer> lst, int x){
        if ( x>=n.length) {
            System.out.println(lst);
            return;
        }

        lst.add(n[x]);
        subsets(n, lst, x+1);
        lst.remove(n[x]);
        subsets(n, lst, x+1);
    }
}
