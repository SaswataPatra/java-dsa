
import java.util.Arrays;
 
class Main
{
    public static int findMinAbsDiff(int[] S)
    {
        // Find the sum of all elements
        int sum = Arrays.stream(S).sum();
 
        // Create a boolean table to store solutions to subproblems
        boolean T[][] = new boolean[S.length + 1][sum + 1];
        for (int i = 0; i <= S.length; i++) {
            T[i][0] = true;
        }

        for( int i =1; i<=S.length; i++) {
            for(int j=1;j<=sum;j++){
                if ( S[i-1] > j ){
                    T[i][j]=T[i-1][j];
                }
                else{
                    T[i][j] =T[i-1][j]||T[i-1][j-S[i-1]];
                }
            }
        }
        for (int i = 0; i <=S.length; i++)
		{
            for (int j = 0; j <=sum; j++)
			System.out.print(T[i][j]+" ");
        System.out.println("");
        System.out.println("");
		} 
        int a =0;
        boolean b=false;
        if ( a==0 && !b){
            System.out.println("Hello");
        }
        int j = sum / 2;
        while (j >= 0 && T[S.length][j]==false) {
            j--;
        }
        
        return sum - 2*j;
    }

 
    public static void main (String[] args)
    {
        // Input: a set of items
        int[] S = { 1,2,7};
 
        System.out.println("The minimum difference is " + findMinAbsDiff(S));
    }
}