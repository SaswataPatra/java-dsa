package DynamicProgramming;
public class MaxCircular {
    public static void main(String[]args){
        int arr[] = {1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(arr));
}
  
public static int maxSubarraySumCircular(int[] nums) {
        int curr_max = nums[0],curr_min=nums[0], max_sum = nums[0], min_sum =nums[0], n =nums.length;
        int sum =nums[0];

        for(int i=1; i<n;i++){
            sum +=nums[i];
            curr_min = Integer.min(curr_min+nums[i], nums[i]);
            min_sum = Integer.min(curr_min,min_sum);
            curr_max = Integer.max(curr_max+nums[i],nums[i]);
            max_sum = Integer.max(curr_max, max_sum);
        }
        if(min_sum==sum) return max_sum;

        return Integer.max(max_sum, sum-min_sum);
}
}