public class kadanes {
    public static void main( String[]args){
        int arr[] = {-1};
        System.out.println(find_max_sum(arr));
    }

    public static int find_max_sum(int[]arr){
        int max_sum = Integer.MIN_VALUE, current_sum =0;

        for ( int i =0; i<arr.length; i++){
            if ( current_sum>0){
                current_sum =current_sum+ arr[i];
            }else{
                current_sum = arr[i];
            }
            if ( current_sum>max_sum){
                max_sum = current_sum;
            }    
        }
        return max_sum;
    }
}
