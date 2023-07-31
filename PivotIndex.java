class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[] = {2,1,-1};
        int sum = pivotIndex(arr);
        System.out.println(sum);
    }
}