package Normal;
import java.util.Arrays;
public class SqSortedArr {
    public static void main(String[]args){
        int arr[] = {-4,-1,0,3,10};
        int sum[] = sq_n_sort(arr);
        for ( int i=0 ;i<sum.length;i++){
            System.out.println(sum[i]);
        } 
    }
    public static int[] sq_n_sort(int [] arr){
        for ( int i =0; i<arr.length; i++){
            arr[i]*= arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
