package DynamicProgramming;

public class UnboundedKnapsack {
    static int knapSack(int n, int W, int val[], int wt[])
    {
        int dp[][] = new int[n+1][W+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0||j==0){
                    dp[i][j] = 0;
                }else if(wt[i-1]<=j){
                    dp[i][j] = Integer.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String args[]) {
		int val[] = new int[] { 1, 2, 5, 6 };
		int wt[] = new int[] { 2, 3, 4, 5 };
		int W = 8;
		int n = val.length;
		System.out.println(knapSack(n,W,val,wt));
	}
}
