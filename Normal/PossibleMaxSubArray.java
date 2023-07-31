package Normal;
public class PossibleMaxSubArray {
    public static void main(String[]args){
        int arr[] = {2,3,7,8,10};
        int sum = 11;

        System.out.print(subsetSum(arr,sum,arr.length));
    }
    //Using_Recursion

    // public static boolean subsetSum(int[]arr,int sum, int n){
    //     if (sum==0){
    //         return true;
    //     }
    //     if ( n<=0 || sum<0){
    //         return false;
    //     }
    //     boolean include = subsetSum(arr, sum-arr[n-1], n-1);
    //     boolean exclude = subsetSum(arr,sum,n-1);

    //     return include||exclude;
    // }

    //Using_Tablular_Method

    public static boolean subsetSum(int[]arr, int sum, int n){
        boolean t[][] = new boolean [n+1][sum+1];

    //     for (int i = 0; i <= sum; i++)
    //     t[0][i] = false;

    // for (int i = 0; i <= n; i++)
    //     t[i][0] = true;

        for (int i = 0; i <= n; i++)
        {
        for (int j = 0; j <=sum; j++){
            if ( i==0){
                t[i][j] = false;
            }
            if ( j==0){
                t[i][j] = true;
            }
        }
    }

        for( int i =1; i<=n; i++){
            for( int j =1; j<=sum; j++){
                if (arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
    }   
}
        for (int i = 0; i <= n; i++)
        {
        for (int j = 0; j <=sum; j++)
            System.out.print(" "+t[i][j]);
        System.out.println();
        } 
    return t[n][sum];
    }
}
    
