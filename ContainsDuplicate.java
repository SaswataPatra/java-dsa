import java.util.*;
public class ContainsDuplicate {
    public static void main(String[]args){
        int arr[] = {3,1,2,4,3};
        System.out.println(containsDuplicate(arr));
    }
    // public static boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);

    //     for(int i=1;i<nums.length;i++){
    //         if(nums[i-1]==nums[i]) return true;
    //     }
    //     return false;
    // }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(hash.contains(nums[i])) return true;

            hash.add(nums[i]);
        }
        return false;
    }

}
