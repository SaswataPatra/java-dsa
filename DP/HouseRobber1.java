package DynamicProgramming;
public class HouseRobber1 {
    public static void main(String[]args){
        int arr[] = {2,7,9,3,1};

        System.out.print(house_robber(arr));
    }
    public static int house_robber(int[]arr){
        int n = arr.length;
        int dp[] = new int[n+1];

        if(n==1){
            return arr[0];
        }

        dp[0] = arr[0];
        dp[1] = Integer.max(arr[0],arr[1]);
        
        for(int i=2;i<n;i++){
            dp[i] = Integer.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}
