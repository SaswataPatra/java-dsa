package DynamicProgramming;

public class CountOfSubsets {

    public static int perfectSum(int arr[],int n, int sum) 
	{ 
        int dp[][] = new int[n+1][sum+1];

        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }
        for(int j=1;j<=sum;j++){
            dp[0][j] = 0;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if (arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for (int i = 0; i <=n; i++)
		{
            for (int j = 0; j <=sum; j++)
			System.out.print(dp[i][j]+" ");
        System.out.println("");
        System.out.println("");
		} 
        return dp[n][sum];
	} 

    public static void main(String[]args){
        int arr[] = {9,7,0,3,9,8,6,5,7,6}; 
        int sum = 31;
        System.out.println( perfectSum(arr,arr.length,sum));
        
    }
    
}
