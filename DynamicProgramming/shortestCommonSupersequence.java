package DynamicProgramming;

public class shortestCommonSupersequence {
    public static int shortestCommonSupersequence(String X,String Y,int m,int n)
    {
        int dp[][] = new int [m+1][n+1];
        int lcs=Integer.MIN_VALUE;
        for(int i=0;i<=m;i++){
            for(int j =0; j<=n;j++){
                if(i==0||j==0){
                    dp[i][j] =0;
                }else if (X.charAt(i-1)==Y.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        for(int i=0;i<=m;i++){
            for(int j =0; j<=n;j++){
                if(dp[i][j]>lcs) lcs = dp[i][j];
            }
        }
        return m+n-lcs;
    }
}
