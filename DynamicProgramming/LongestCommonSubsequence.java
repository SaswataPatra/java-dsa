package DynamicProgramming;

public class LongestCommonSubsequence {
    public static void main(String[]args){
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(lcs(s1,s2,s1.length(),s2.length()));
}


// public static int lcs(char[]x,char[]y,int m,int n){
//      if(n==0||m==0) return 0;
    
//     if(x[m-1]==y[n-1])
//         return lcs(x,y,m-1,n-1)+1;
    
//     return Integer.max(lcs(x,y,m-1,n),lcs(x,y,m,n-1));
// }

//RECURSIVE
//     public int lcs(char[]x,char[]y,int m,int n){
//         if(n==0||m==0) return 0;
    
//         if(x[m-1]==y[n-1])
//             return lcs(x,y,m-1,n-1)+1;

//         return Integer.max(lcs(x,y,m-1,n),lcs(x,y,m,n-1));
// }

//MEMOIZATION
    
//     public int lcs(String X,String Y,int m,int n,int[][]dp){
//          // return if the end of either sequence is reached
//         if (m == 0 || n == 0) {
//             return 0;
//         }
//         if(dp[m][n]!=-1) return dp[m][n];
        
 
//         // if the last character of `X` and `Y` matches
//         if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            
//             return dp[m][n] = lcs(X, Y,m - 1, n - 1,dp) + 1;
//         }
 
//         // otherwise, if the last character of `X` and `Y` don't match
//         return dp[m][n]=Integer.max(lcs(X, Y, m, n - 1,dp),
//                         lcs(X, Y, m - 1, n,dp));
// }

public static int lcs(String x,String y,int m,int n){
    int dp[][] = new int[m+1][n+1];
    
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(i==0||j==0) dp[i][j] = 0;
            if(x.charAt(i)==y.charAt(j))
                dp[i][j] = dp[i-1][j-1] ;
            else dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]);
        }
    }
    return dp[m][n];
}
}
