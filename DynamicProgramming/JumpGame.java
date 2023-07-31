package DynamicProgramming;
public class JumpGame {
    public static void main(String[]args){
        int arr[] = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }

    public static boolean canJump(int[]nums){
        int n = nums.length;
        if (n==1) return true;
        int goal = n-1;
        for ( int i=n-2;i>=0;i--){
            if(nums[i]+i>=goal){
                goal = i;
            }
            if ( goal==0){
                return true;
            }
        }
        return false;
    }
}
