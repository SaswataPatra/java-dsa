public class knap_tab_prac {
    public static void main ( String[] args) {
        int wt[] = { 2, 3, 4,5 };
        int val[] = {1,2,5,6};
        int w = 8;

        System.out.println(knapsack(wt,val,w,wt.length));
    }

    // static int max(int a, int b){
    //     return (a>b)?a:b;
    // }
    // public static int knapsack(int[] wt,int[] val, int W, int n ){
    //     int T[][] = new int[n+1][W+1];
        
    //     for ( int i =0; i<=n; i++){
    //         for( int w = 0; w<=W; w++){
    //             if ( w==0 || i==0){
    //                 T[i][w] = 0;
    //             }
    //             else if ( wt[i-1]<=w){
    //                 T[i][w] = max(val[i-1] + T[i-1][w-wt[i-1]], T[i-1][w]);
    //             }
    //             else 
    //             T[i][w] = T[i-1][w];
    //         }  
    //     }
    //     return T[n][W];
    // }
        static int max(int a, int b){
            return (a>b)?a:b;
        }

    public static int knapsack(int[]wt, int[]val, int W,int n){
        int t[][] = new int[n+1][W+1];

        for ( int i =0; i<=n;i++){
            for( int w=0; w<=W; w++){
                if ( w==0|| i==0){
                    t[i][w] = 0;
                }
                else if ( wt[i-1]<=w){
                    t[i][w] = max(val[i-1]+t[i-1][w-wt[i-1]],t[i-1][w]);
                }else{
                    t[i][w] = t[i-1][w];
                }
            }
        }
        return t[n][W];
    }
}
