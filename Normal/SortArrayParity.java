package Normal;
public class SortArrayParity {
    public static void main(String[]args){
        int arr[] = {3,1,2,4};
        arr = sortArrayByParity(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
    public static int[] sortArrayByParity(int[] nums) {
        int cursor=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                int tmp=nums[cursor];
                nums[cursor] = nums[i];
                nums[i] = tmp;
                cursor++;
            }
        }
        return nums;
    }
}
