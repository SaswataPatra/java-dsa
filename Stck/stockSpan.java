package Stck;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
public class stockSpan {
    public static void main(String[]args){
        int[] arr = {100,80,60,70,60,75,85};
        int n = 7;
        // System.out.println(nextLargerElement(arr,n));
        arr = calculateSpan(arr,n);
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);
    }   
        public static int[] calculateSpan(int price[], int n)
    {
        int res[] = new int[n];
        Stack<int[]> s = new Stack<>();
        return (helper(res, price, n,s));
    }
    public static int[] helper(int[] res, int[] price, int n,Stack<int[]> s){
        for(int i =0;i<n; i++){
            if(s.size()==0) res[i] = -1;
            else if(s.size()>0 && s.peek()[0]>price[i]) res[i] = s.peek()[1];
            else if(s.size()>0 && s.peek()[0]<=price[i]){
                while(s.size()>0 && s.peek()[0]<=price[i])
                    s.pop();
            if(s.size()==0) res[i] = -1;
            else res[i] = s.peek()[1];
        }
        int temp[] = {price[i],i};
        s.push(temp);
        }
        for(int i =0;i<n;i++){
            res[i] = i-res[i];
        }
        return res;
    }
}
