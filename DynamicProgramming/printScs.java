package DynamicProgramming;

public class printScs {
    
    public String shortestCommonSupersequence(String str1, String str2) {
        return lcs(str1,str2,str1.length(),str2.length());
    }
    public String lcs(String str1, String str2, int m, int n){
        int dp[][] = new int[m+1][n+1];
        
        for(int i =0;i<=m; i++){
            for(int j =0; j<=n;j++){
                if(i==0||j==0){
                    dp[i][j] = 0;
                }else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int i=m, j=n;
        // List<String> str = new ArrayList<>();
        StringBuffer str = new StringBuffer();
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                // str = str+str1.charAt(i-1);
                str.append(str1.charAt(i-1));
                i--;
                j--;
            }else if (dp[i-1][j]>dp[i][j-1]){
                // str = str + str1.charAt(i-1);
                str.append(str1.charAt(i-1));
                i--;
            }else{
                // str = str + str2.charAt(j-1);
                str.append(str2.charAt(j-1));
                j--;
            }
        }
        while(i>0){
            // str = str+ str1.charAt(i-1);
            str.append(str1.charAt(i-1));
            i--;
        }
        while(j>0){
            // str = str + str2.charAt(j-1);
            str.append(str2.charAt(j-1));
            j--;
        }
        return str.reverse().toString();
    }
}
