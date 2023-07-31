import java.util.ArrayList;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(int[] nums) {
        int k=0;
        ArrayList<Integer> expectedNums = new ArrayList<>();
        for ( int i =1; i<nums.length;i++){
            if ( nums[i]==nums[i-1]){
                continue;
            }
            else{
                k++;
                expectedNums.add(nums[i-1]);
            }
        }
        System.out.println(k);
        return expectedNums;
        }
    public static void main(String[]args){
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        ArrayList<Integer> soln_array = new ArrayList<>();
        soln_array = removeDuplicates(nums);
        for (int soln : soln_array){
            System.out.print(soln + " ");
        }

    }
}
