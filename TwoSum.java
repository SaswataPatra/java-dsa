import java.util.Arrays;
import java.util.HashSet;

// public class TwoSum {
//         public static int[] twoSum(int[] nums, int target) {
//             int i,j=0;
//             for( i =0;i<nums.length;i++){
//                 for( j = i+1; i<nums.length-1; j++){
//                     if((nums[i]+nums[j])==target){
//                         return new int[]{i,j};
//                     }
//                     }
//             }
//             return null;
//         }
//         public static void main(String[] args){
//             int arr[] = {0,1,2,3,4,5,6};
//             System.out.println("Hash map :-");
//             java.util.Map<Integer, Integer> map = new java.util.HashMap<Integer, Integer>();
//             for (int i = 0; i < arr.length; i++) {
//                 map.put(arr[i], i);
//             }
//             System.out.println(map);
//             int[] ans = twoSum(arr,5);
//                 System.out.printf("[%d,%d]\n",ans[0],ans[1]);
//         }
//     }
    

public class TwoSum {
    //TRIVIAL HASH MAP SOLUTION
    // public static int[] twoSum(int[] nums, int target) {
    //     java.util.Map<Integer,Integer> map = new java.util.HashMap<Integer, Integer>();
    //     for (int i =0 ;i<nums.length ;i++){
    //         map.put(nums[i],i);
    //     }
    //     for (int i =0;i<nums.length ;i++){
    //         int complement = nums[i] - target;
    //        if (map.containsKey(complement) && map.get(complement) != i){
    //            return new int[] {map.get(complement),i};
    //         }
    //     }
    //     return null;
    // }
   

    public static void main(String[]args){
            int arr[] = {-1,-2,-3,-4,-5};
            int target =-8;
            System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    // static int[] twoSum(int[]arr, int target){
    //     int n = arr.length;
    //     int ptr1 = 0;
    //     int ptr2 = n-1;
    //     int res[] = new int[2];
    //     for(int i =0; i<n;i++){
    //         if(arr[ptr1]+arr[ptr2]>target){
    //             //decrease ptr2
    //             ptr2--;
    //         }else if(arr[ptr1]+arr[ptr2]<target){
    //             //increase ptr1
    //             ptr1++;
    //         }else{
    //             break;
    //         }
    //     }
    //     res[0] = ptr1;
    //     res[1] =ptr2;
    //     return res;
    // }
    static int[] twoSum(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int result[] = new int[2];

		while (start < end) {
			int sum = nums[start] + nums[end];
			if (sum == target) {
				result[0] = start + 1;
				result[1] = end + 1;
				break;
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}
		}
		return result;
	}
}
