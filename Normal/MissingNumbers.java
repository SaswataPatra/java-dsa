package Normal;

import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[]args){
        int arr[] = {3,0,1};
        System.out.println(missingNumber(arr));
}
//straight forward approach
// public static int missingNumber(int[] nums) {
//     int n =nums.length;
//     Arrays.sort(nums);
//     int count =0;
//     for(int i=0;i<=n;i++){
//         if(i!=n){
//         if(count != nums[i]) return i;
//         }else{
//             return count;
//         }
//         count++;
//     }
//     return 0;
// }


//	The missing number will be the difference between the sum of numbers from 0 to N (N*(N+1)/2) and the sum of all numbers in the array.

public static int missingNumber(int[] nums) {
    int sum = 0, n =nums.length;
    for (int i : nums) {
        sum += i;
    }
    return (n*(n+1)/2)-sum;
}
}
