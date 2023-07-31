package DynamicProgramming;

public class MaxProduct {
    public static void main(String[]args){
        int arr[] = {-2,0,-1};
        System.out.println(maxProduct(arr));
}

    public static int maxProduct(int[] nums) {
        // if (nums.length==1) return nums[0];
        int currMax = nums[0],currMin=nums[0],res = nums[0], l=0;
        for(int i =1; i<nums.length;i++){
            if(currMax==0 && currMin==0){
                currMax =1;
                currMin =1;
            }
            int tmp = currMax*nums[i];
            currMax = Math.max(Math.max(tmp,currMin*nums[i]),nums[i]);
            currMin = Math.min(Math.min(tmp,currMin*nums[i]),nums[i]);
            res = Math.max(currMax,res);
        }
            return res;
        }
    }

