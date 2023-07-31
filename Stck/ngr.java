package Stck;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
public class ngr {
    public static void main(String[]args){
        long[] arr = {6,8,0,1,3};
        int n = 4;
        // System.out.println(nextLargerElement(arr,n));
        arr = nextLargerElement(arr,n);
        List<Long> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
    }   
        //Function to find the next greater element for each element of the array.
        public static long[] nextLargerElement(long[] arr, int n)
        { 
            Stack<Long> s = new Stack<>();
            long []res = new long[n];
            return (helper(s,arr,res,n));
        } 
        public static long[] helper(Stack<Long> s, long[] arr,long[] res, int n){
            for(int i=n-1; i>=0; i--){
                if(s.size()==0){
                    res[i] = -1;
                }else if(s.size()>0 && s.peek()>arr[i]){
                    res[i] = s.peek();
                }else if(s.size()>0 && s.peek()<=arr[i]){
                    while(s.size()>0 && s.peek()<=arr[i]){
                        s.pop();
                    }
                    if(s.size()==0) res[i] = -1;
                    else res[i] = s.peek();
                }
                s.push(arr[i]);
            }
            return res;
        }
}
