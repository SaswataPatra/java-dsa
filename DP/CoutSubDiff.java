import java.util.Arrays;
public class CoutSubDiff {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int diff =6;

    System.out.println(partition(arr,arr.length,diff));
    }

    public static int partition(int[] arr,int n, int diff){
        int sum1 = ((Arrays.stream(arr).sum())+diff)/2;
        return subset_sum(arr,n,sum1);
    }
    public static int subset_sum(int[] arr,int n,int sum){
        int T[][] = new int[n+1][sum+1];

        for(int i=0;i<=n;i++){
            T[i][0] = 1;
            for(int j =1; i>0 && j<=sum;j++){
                if (arr[i-1]>j){
                    T[i][j] = T[i-1][j];
                }else{
                    T[i][j] = T[i-1][j] + T[i-1][j-arr[i-1]];
                }
            }
        }
        return T[n][sum];
    }
}
