package DynamicProgramming;
import java.util.*;
public class CoinChangeMaxWays {

    public static void main(String[]args){
        int arr[] = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(arr,amount));
}

//GREEDY APPROACH
    // public static int coinChange(int[] coins, int amount) {
    //     int count=0;
    //     Arrays.sort(coins);
    //     int i=coins.length-1;
    //     while(amount!=0&&i>=0){
    //         if(coins[i]<=amount){
    //             amount = amount-coins[i];
    //             count++;
    //         }else{
    //             i--;
    //         }
    //     }
    //     if (amount!=0) return -1;
    //     return count;
    // }

    public static int coinChange(int[] arr, int amount) {
        int n = arr.length;
        int dp[][] =new int[n+1][amount+1];
        
        for(int i=0;i<=n;i++){
            dp[i][0] =1;
        }
        for(int j=1;j<=amount;j++){
            dp[0][j] = 0;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i][j-arr[i-1]] +dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
    }
}
