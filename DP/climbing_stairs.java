package DP;
public class climbing_stairs {
    public static void main( String[]args){
        int n =25;
        int memo[] = new int[n+1];
        System.out.println(stairs(n,memo));
    }
    public static int stairs(int n, int[]memo){
        if(n<=1) return 1;
        if(memo[n]>0) return memo[n];
        return memo[n]=stairs(n-1,memo)+stairs(n-2,memo);
    }
}
