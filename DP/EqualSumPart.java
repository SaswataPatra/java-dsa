import java.util.Arrays;
public class EqualSumPart {
    public static void main(String[]args){
        int arr[] = {2,3,5,10,8};

        System.out.println( partition(arr,arr.length));
        
    }

    public static boolean partition(int [] arr, int n){

        int sum = Arrays.stream(arr).sum();

        return (sum%2 ==0) && subset_sum(arr,n,sum/2);
    }

    public static boolean subset_sum(int[] arr,int n,int sum){

        boolean dp[][] = new boolean[n+1][sum+1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for( int i =1; i<=n;i++){
            for(int j=1;j<=sum;j++){
                if ( arr[i-1] > j ){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j]||dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[n][sum];
    }
}
