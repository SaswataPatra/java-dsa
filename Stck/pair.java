package Stck;
import java.util.Stack;
public class pair {
    public static void main(String[]args){
        Stack<int[]> s = new Stack<>();
        int arr[] = {1,2};
        s.push(arr);
        System.out.println(s.peek()[0]);
    }
}
