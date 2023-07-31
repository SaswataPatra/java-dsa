package Stck;
import java.util.*;
import java.util.Stack;
// import java.util.stream.Collectors;
public class ngl {
    public static void main(String[]args){
        int[] arr = {1,5,0,3,4,5};
        int n = 6;
        // System.out.println(nextLargerElement(arr,n));
        List<Integer> res = leftSmaller(n,arr);
        System.out.println(res);
        // List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    }
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> res = new ArrayList<>();
        
        Stack<Integer> s = new Stack<>();
        return ( helper(res, s, n , a));
    }
    
    public static List<Integer> helper(List<Integer> res, Stack<Integer> s, int n, int[] a){
        for(int i=0;i<n ;i++){
            if(s.size()==0) res.add(-1);
            else if(s.size()>0 && s.peek()<a[i]) res.add(s.peek());
            else if(s.size()>0 && s.peek()>=a[i]){
                while(s.size()>0 && s.peek()>=a[i]){
                    // System.out.println("s :"+ s.peek()+ " a[i] :"+a[i]);
                    s.pop();
                }
                if(s.size()==0) res.add(-1);
                else res.add(s.peek());
            }
            s.push(a[i]);
        }
        return res;
    }
}
