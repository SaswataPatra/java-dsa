package DP;
import java.util.Arrays;
public class ClimbingStairs {
    public static void main(String[] args){
        int n=5;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int memo[] = new int[n+1];
        Arrays.fill(memo,-1);
        return (stairs(n,memo));
    }
     public static int stairs(int n, int[]memo){
        if(n<=1) return 1;
        if(memo[n]!=-1) return memo[n];
        return memo[n]=stairs(n-1,memo)+stairs(n-2,memo);
    }
    
}
