// public class knapsack_dp {
//     public static int max(int a, int b){
//         return a>b ? a:b;
//     }
//     public static int knapsack(int[] wt,int[] val, int w,int n){
//         if (w==0 || n==0){
//             return 0;
//         }
//         else if (wt[n-1]>w){
//             return knapsack(wt,val,w,n-1);
//         }else{
//             return (    max(val[n-1]+knapsack(wt,val,w-wt[n-1],n-1),knapsack(wt,val,w,n-1)) );
//         }
//     }
//     public static void main(String[] args){
//     long start=System.currentTimeMillis();
//         int val[] = { 60, 100, 120 };
//         int wt[] = { 10, 20, 30 };
//         int w = 50;
//         int n = wt.length;
//         System.out.println(knapsack(wt,val,w,n));
// System.out.println("Execution time : "+(System.currentTimeMillis()-start));
//         }
// }

//dynamic programming
// class knapsack_dp{

//     // A utility function that returns
//     // maximum of two integers	
//     static int max(int a, int b)	
//     {	
//         return (a > b) ? a : b;	
//     }

//     // Returns the value of maximum profit
//     static int knapSackRec(int W, int wt[],
//                         int val[], int n,
//                         int [][]dp)
//     {

//         // Base condition
//         if (n == 0 || W == 0)
//             return 0;

//         if (dp[n][W] != -1)
//             return dp[n][W];

//         if (wt[n - 1] > W)

//             // Store the value of function call
//             // stack in table before return
//             return dp[n][W] = knapSackRec(W, wt, val,
//                                         n - 1, dp);

//         else

//             // Return value of table after storing
//             return dp[n][W] = max((val[n - 1] +
//                                 knapSackRec(W - wt[n - 1], wt,
//                                             val, n - 1, dp)),
//                                 knapSackRec(W, wt, val,
//                                             n - 1, dp));			
//     }

//     static int knapSack(int W, int wt[], int val[], int N)
//     {

//         // Declare the table dynamically
//         int dp[][] = new int[N + 1][W + 1];

//         // Loop to initially filled the
//         // table with -1
//         for(int i = 0; i < N + 1; i++)
//             for(int j = 0; j < W + 1; j++)
//                 dp[i][j] = -1;

//         return knapSackRec(W, wt, val, N, dp);	
//     }

//     // Driver Code
//     public static void main(String [] args)
//     {	long start=System.currentTimeMillis();
//         int val[] = { 60, 100, 120 };
//         int wt[] = { 10, 20, 30 };

//         int W = 50;
//         int N = val.length;		

//         System.out.println(knapSack(W, wt, val, N));
//         System.out.println("Execution time : "+(System.currentTimeMillis()-start));
//     }	
//     }

//     // This Code is contributed By FARAZ AHMAD

// A Dynamic Programming based solution
// for 0-1 Knapsack problem
class Knapsack {

	// A utility function that returns
	// maximum of two integers
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// Returns the maximum value that can
	// be put in a knapsack of capacity W
	static int knapSack(int W, int wt[],
			int val[], int n) {
		int i, w;
		int K[][] = new int[n + 1][W + 1];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= n; i++) {
			for (w = 0; w <= W; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
 				else if (wt[i - 1] <= w){
					// int t1 = val[i-1],t2=K[i-1][w-wt[i-1]],t3 = K[i-1][w],w_wt = w-wt[i-1];
					K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
					// int ans = K[i][w];
				}
				else
					K[i][w] = K[i - 1][w];
					// int ans = K[i][w];
					// int gargb =0;
			}
		}
		for (i = 0; i <= n; i++) {
			for (w = 0; w <= W; w++) {
				System.out.print(K[i][w] + " ");
			}
			System.out.println("");
			System.out.println("");
		}
		return K[n][W];
	}

	// Driver code
	public static void main(String args[]) {
		int val[] = new int[] { 1, 2, 5, 6 };
		int wt[] = new int[] { 2, 3, 4, 5 };
		int W = 8;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
	}
}
/* This code is contributed by Rajat Mishra */
