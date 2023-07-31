
package DynamicProgramming;
import java.util.*;
public class PrintingLCS {
    public static void main(String[]args){
        String s = "acbcf";
        String t ="abcdf";
        System.out.println(all_longest_common_subsequences(s, t));
    }

    public static List<String> all_longest_common_subsequences(String s, String t)
    {
        List<String> str = new ArrayList<>();
        int m = s.length(),n = t.length();
        int dp[][] = new int[m+1][n+1];
        for(int i =0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0) dp[i][j] = 0;
                
                else if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] =1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        int i=m,j=n;
        while(i>0&&j>0){
            if(s.charAt(i-1)==t.charAt(j-1)){
                str.add(String.valueOf(s.charAt(i-1)));
                i--;
                j--;
            }else{
                int tmp = (dp[i-1][j]>dp[i][j-1])?i--:j--;
            }
        }
        Collections.reverse(str);
        return str;
    }
}
