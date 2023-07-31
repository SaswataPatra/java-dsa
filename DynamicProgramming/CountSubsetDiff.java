package DynamicProgramming;
import java.util.Arrays;
public class CountSubsetDiff {
    public static void main(String[]args){
        int arr[]  = {100};
        int diff = -200;
        System.out.println(findTargetSumWays(arr,diff));
    }
    public static int findTargetSumWays(int[] nums, int target) {
        //Solution 1
        int sum = 0;
        for(int x : nums)
            sum += x;
        if(((sum - target) % 2 == 1) || (target > sum))
            return 0;
        
        int n = nums.length;
        int s2 = (sum - target)/2;
        int[][] t = new int[n + 1][s2 + 1];
        t[0][0] = 1;
        
        for(int i = 1; i < n + 1; i++) {
            for(int j = 0; j < s2 + 1; j++) {
                if(nums[i - 1] <= j)
                    t[i][j] = t[i-1][j] + t[i - 1][j - nums[i - 1]];
                else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][s2];
    }
    public static int countSubsetDiff(int []nums , int target){
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        if(((sum - target) % 2 == 1) || (target > sum))
            return 0;
        return countsubsetSum(nums,(target+sum)/2,n);
    }

    public static int countsubsetSum(int[] nums, int sum,int n){
        int dp[][] = new int [n+1][sum+1];
        for(int i=0;i<=n;i++)
            dp[i][0] = 1;
        for(int j=1;j<=sum;j++)
            dp[0][j] = 0;

        for(int i =1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(nums[i-1]<=j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
