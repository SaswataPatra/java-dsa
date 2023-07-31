package Normal;
import java.util.LanguageRange;

public class RunningSum {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};
        int sum[] = find_sum(arr);
        for ( int i=0 ;i<sum.length;i++){
            System.out.println(sum[i]);
        } 
    }
    public static int[] find_sum(int []nums){
        int count=0;
        for ( int i =0; i<nums.length;i++){
            count+= nums[i];
            nums[i] = count;
        }
        return nums;
    }
    
}
