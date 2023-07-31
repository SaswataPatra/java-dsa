package DynamicProgramming;
public class Tribonacci {
    public static void main( String[]args){
        int n =25;
        int memo[] = new int[n+1];
        System.out.println(tribo(n,memo));
    }
    public static int tribo(int n, int[]memo){
        if(n==0) return 0;
        if ( n==1||n==2) return 1;
        if(memo[n]>0) return memo[n];
        return memo[n]=tribo(n-1,memo)+tribo(n-2,memo)+tribo(n-3,memo);
    }
}
