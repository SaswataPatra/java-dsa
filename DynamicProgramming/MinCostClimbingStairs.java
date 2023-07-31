package DynamicProgramming;
public class MinCostClimbingStairs {
    public static void main( String[]args){
        int arr[] = {1,100,1,1,1,100,1,1,100,1};

        System.out.println(find_min(arr));
    }

    public static int find_min(int[]arr){
        int n = arr.length;
        int dp[] = new int[n+1];

        //base cases
        dp[0] = arr[0];
        dp[1] = arr[1];

        for( int i =2; i<n+1;i++){

            if ( i!=n){
                dp[i] = arr[i]+Integer.min(dp[i-1], dp[i-2]);
            }
            else{
                dp[i] = Integer.min(dp[i-1],dp[i-2]);
            }
        }
        return dp[n];

    }
}
