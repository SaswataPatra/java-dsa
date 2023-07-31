package DynamicProgramming;
public class HouseRobber2 {
    public static void main(String[]args){
        int arr[] = {1,2,3};
        System.out.print(rob(arr));
    }
    public static int rob(int[]arr){
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        int rob1 = rob_job(0,n-1,arr);
        int rob2 = rob_job(1,n,arr);
        return(Integer.max(rob1,rob2));

    }
    public static int rob_job(int start,int end,int[]arr){
        int n = arr.length-1;
        int dp[] = new int[n+1];
        if (end-start==1) return arr[start];
        dp[start] = arr[start];
        dp[start+1] = Integer.max(arr[start],arr[start+1]);
        int max = dp[start+1];
        for(int i =2+start; i<end;i++){
            dp[i] = Integer.max(dp[i-2]+arr[i], dp[i-1]);
            if (dp[i]>max){
                max = dp[i];
            }
        }
        return max;
    }
}
