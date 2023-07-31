package DynamicProgramming;
import java.util.*;
public class CoinChangeMin {
	
    public static void main(String[]args){
        int arr[] = {9,2,11,5,14,17,8,18};
        int amount = 39;
        System.out.println(minCoins(arr,arr.length,amount));
}

public static int minCoins(int coins[], int n, int V) 
	{   Arrays.sort(coins);
	    int dp[][] = new int[n+1][V+1];
	    
	    for(int i =0;i<=V;i++){
	        dp[0][i] = Integer.MAX_VALUE-1; //Why -1
	    }
	    for(int j=1;j<=n;j++){
	        dp[j][0] = 0;
	    }
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=V;j++){
	            if(coins[i-1]<=j){
	                dp[i][j] = Integer.min(dp[i][j-coins[i-1]]+1,dp[i-1][j]);
	            }else{
	                dp[i][j] = dp[i-1][j];
	            }
	        }
	    }
        for (int i = 0; i <=n; i++)
		{
            for (int j = 0; j <=V; j++)
			System.out.print(dp[i][j]+" ");
        System.out.println("");
        System.out.println("");
		} 
        if (dp[n][V]!=Integer.MAX_VALUE-1) return dp[n][V];
	    return -1;
	}
    
}
