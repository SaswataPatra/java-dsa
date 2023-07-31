package Normal;
// public class SubsetSum {
//     public static void main(String[] args){
//         int arr[] = {2,3,7,8,10};
//         int w = 14;

//         boolean ans = subset(arr,arr.length-1,w);
//         System.out.println(ans);
//     }

//     public static boolean subset(int[] arr, int n, int sum){
//         if (sum == 0)
//         return true;
//         if (sum<0 || n<0)
//         return false;

//         boolean include = subset(arr,n-1,sum-arr[n]);
//         boolean exclude = subset(arr,n-1,sum);

//         return include || exclude;
//     }
// }


//  Dynamic Programming solution for subset
// sum problem

class Sub
{
    public static boolean subsetSum(int[] A, int k)
    {
        int n = A.length;
 
        boolean[][] T = new boolean[n + 1][k + 1];
 
        for (int i = 0; i <= n; i++) {
            T[i][0] = true;
            if (i!=0){
                T[0][i] = false;
            }
        }
 
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= k; j++)
            {
                if (A[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                }
                else {
                    
                    T[i][j] = T[i - 1][j] || T[i - 1][j - A[i - 1]];
                }
            }
        }
        for (int i = 0; i <=n; i++)
		{
            for (int j = 0; j <=k; j++)
			System.out.print(T[i][j]+" ");
        System.out.println("");
        System.out.println("");
		} 
 
        return T[n][k];
    }
 
    public static void main(String[] args)
    {

        int[] A = {2,3,7,8,10};
        int k = 11;
 
        if (subsetSum(A, k)) {
            System.out.println("sum exists");
        }
        else {
            System.out.println("Sum doesnt exist");
        }
    }
}