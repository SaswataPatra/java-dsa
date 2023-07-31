package Normal;

public class ShortestUnsortedArray {
    public static void main(String[]args){
        int arr[]  = {1,3,2,3,3};
        System.out.println(findUnsortedSubarray(arr));;
    }

    public static int findUnsortedSubarray(int[] nums){

        int n = nums.length;
        int p1=Integer.MAX_VALUE,p2=Integer.MAX_VALUE;
        for(int i =1;i<n;i++){
            if(nums[i-1]>=nums[i]){
                if(p1==Integer.MAX_VALUE && nums[i-1]>nums[i]){
                    p1=i-1;
                }else{
                    p2=i+1;
                }
            }
        }
        if (p1==p2) return 0;
        if(p1==Integer.MAX_VALUE) return 0;
        if(p2==Integer.MAX_VALUE) return 2;
        return p2-p1;

    }
}
