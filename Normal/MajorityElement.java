package Normal;
import java.util.Arrays;
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count =0, pos=0, max_count = Integer.MIN_VALUE;
        for ( int i =1; i<nums.length; i++){

            if ( nums[i-1]==nums[i]){
                count= count +1;
                if ( count >max_count){
                    max_count = count;
                    pos = i;
                }
            }else{
                count =0;
            }
        }
        return nums[pos];
    }
    public static void main(String[]args){
        int arr[] = {1,2,1,2,1,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4};
        int sum = majorityElement(arr);
        System.out.println(sum);
    }

}
//ASHAMED 
// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
//     }
// }