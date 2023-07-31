public class MoveZeroes {
    public static int[] moveZero(int []nums){
        int cursor1 = Integer.MAX_VALUE; //first occurence of 0's position
        if (nums.length==0)
        return nums;
        for ( int i =0; i<nums.length;i++){
            if ( nums[i]==0 && cursor1==Integer.MAX_VALUE){
                cursor1 = i;
            }
            if ( nums[i]!=0 && cursor1!=Integer.MAX_VALUE){
                nums[cursor1++] = nums[i];
                nums[i] = 0;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        int arr[] = {1};
        arr = moveZero(arr);
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
