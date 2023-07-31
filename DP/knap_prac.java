public class knap_prac {
    public static void main ( String[] args) {
        int wt[] = {1, 2, 3, 8, 7, 4 };
        int val[] = {20, 5, 10, 40, 15, 25};
        int w = 10;

        System.out.println(knapsack(wt,val,w,wt.length));
    }

    // public static int knapsack(int[] wt,int[] val, int w,int n){
    //     if (w==0||n==0){
    //         return 0;
    //     }
    //     if ( wt[n-1]<=w){
    //         return Integer.max((val[n-1]+knapsack(wt, val, w-wt[n-1], n-1)), knapsack(wt, val, w, n-1));
    //     }
    //     else {
    //         return knapsack(wt, val, w, n-1);
    //     }
    // }

    public static int knapsack( int[] wt, int[] val, int w, int n){
        if (w < 0) {
			return Integer.MIN_VALUE;
		}

		// base case: no items left or capacity becomes 0
		if (n <= 0 || w == 0) {
			return 0;
		}
        int include = val[n-1] + knapsack(wt, val, w - wt[n-1],n-1);

		// Case 2. Exclude current item `v[n]` from the knapsack and recur for
		// remaining items `n-1`

		int exclude = knapsack(wt, val,w,n-1);

		// return maximum value we get by including or excluding the current item
		return Integer.max(include, exclude);
    }
}
