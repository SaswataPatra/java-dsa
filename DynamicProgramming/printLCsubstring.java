package DynamicProgramming;
class position{
    int i=0;
    int j=0;
}
public class printLCsubstring {
    public static void main(String[]args){
        String str1 = "babad";
        String str2 = "dabab";
        System.out.println(longestCommonSubstring(str1, str2));
    }
    public static String longestCommonSubstring(String s1, String s2) {
        return (lcs(s1,s2,s1.length(),s2.length()));
    }
    public static String lcs(String s1,String s2, int m,int n){
        int dp[][] = new int[m+1][n+1];
        int max = Integer.MIN_VALUE;
        position pos = new position();
        for(int i=0; i<=m ; i++){
            for(int j =0; j<=n;j++){
                if (i==0||j==0){
                    dp[i][j] = 0;
                }else if (s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                    if (dp[i][j]>=max) {
                        pos.i =i;
                        pos.j = j;
                        max = dp[i][j];
                    }
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        System.out.println("i :"+ pos.i + "j :"+ pos.j);
        for(int i=0;i<=m;i++){
            for(int j =0;j<=n;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        StringBuffer sb = new StringBuffer();
        int i=pos.i,j=pos.j;
        while(dp[i][j]!=0 && s1.charAt(i-1)==s2.charAt(j-1)){
            // if(s1.charAt(i-1)==s2.charAt(j-1))
            sb.append(s1.charAt(i-1));
            i--;
            j--; 
        }
        return sb.reverse().toString();
    }
}
