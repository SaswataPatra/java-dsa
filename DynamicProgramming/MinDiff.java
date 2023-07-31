package DynamicProgramming;
import java.util.*;

public class MinDiff {

    
    public static int minimumDifference(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int n = nums.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        
        for(int i=0;i<=n;i++)
            dp[i][0] = true;
        for(int j=1;j<=sum;j++)
            dp[0][j] = false;
        
        for(int i =1;i<=n;i++){
            for(int j =1;j<=sum;j++){
                if(nums[i-1]<=j)
                    dp[i][j] = dp[i-1][j-nums[i-1]]||dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        int mn = Integer.MAX_VALUE;
        //The below one definitely works
        // for(int i=0;i<=sum/2;i++){
        //     if(dp[n][i]==true)
        //         mn = Integer.min(mn, sum-2*i);      
        // }
        for (int j = sum / 2; j >= 0; j--) {
            if (dp[n][j] == true) {
                mn = sum - 2 * j;
                break;
            }
        }
        return mn;
    }

    public static void main(String[] args)
    {
        int arr[] = { 1,100000};
        // int n = arr.length;
        System.out.println(
            "The minimum difference between 2 sets is "
            + minimumDifference(arr));
    }
}
