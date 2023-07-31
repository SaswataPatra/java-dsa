package recursion;
import java.util.*;
public class combinations {

    public static void main(String[]args) {
        List<List<Integer>> res = combine(3, 2);
        System.out.println(res);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generateSubsets(res, temp, 1, n);
        System.out.println(res);
        // System.out.println(res.get(1).size());
        for ( int i =0;i<res.size(); i++){
            int var1 = res.get(i).size();
            List<Integer> var2 = res.get(i);
            if (res.get(i).size() != k){
                System.out.println("REMOVED - size :"+res.get(i).size()+" element :"+res.get(i));
                res.remove(i);
            }else{
                System.out.println("size :"+res.get(i).size()+" element :"+res.get(i));
                continue;
            }
        }
        return res;
    }
    
    public static void generateSubsets(List<List<Integer>> res, List<Integer> curr, int index, int num){
        res.add(new ArrayList(curr));
        for ( int i =index; i<=num; i++){
            curr.add(i);
            generateSubsets(res, curr, i+1, num);
            curr.remove(curr.size()-1);
        }
    }
    
}
