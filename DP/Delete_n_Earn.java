import java.util.*;
public class Delete_n_Earn {
    public static void main(String[]args){
        int arr[] = {3,4,2};
        System.out.println(deleteAndEarn(arr));
    }

//NON - RECURSIVE SPECIAL APPROACH

    // public static int deleteAndEarn(int[] nums) {
    //     int earn1=0,earn2=0,curr_earn=0;
    //     HashMap<Integer,Integer> count = new HashMap<>();

    //     for ( int i=0;i<nums.length;i++){
    //         if ( count.containsKey(nums[i])){
    //             count.put(nums[i],count.get(nums[i])+1);

    //         }else{
    //             count.put(nums[i], 1);
    //         }
    //     }
       
    //     int arr[] = new int[count.size()];
    //     int i =0;
    //     for(int key : count.keySet()){
    //         arr[i++] = key;
    //     }
    //     Arrays.sort(arr);
    //         for(i=0;i<arr.length;i++){
    //             curr_earn = arr[i]*count.get(arr[i]);
    //         if (  i>0 && arr[i] == arr[i-1]+1){
    //             int tmp = earn2;
    //             earn2 = Integer.max(curr_earn+earn1,earn2);
    //             earn1 = tmp;
    //         }else{
    //             int tmp = earn2;
    //             earn2 = curr_earn + earn2;
    //             earn1 = tmp;
    //         }
    //     }
    //     return earn2;
    // }

//USING NORMAL DP METHOD- SIMILAR TO HOUSE ROBBER

public static int deleteAndEarn(int[] nums) {
    int n = nums.length;
    if(n==1) return nums[0];
    int max = Arrays.stream(nums).max().getAsInt();
    int count[] = new int[max+1];
    for(int i:nums) count[i]++;

    int dp[] = new int[max+1];
    dp[0] = count[0];
    dp[1] = count[1]*1;

    for(int i=2;i<count.length;i++){
        dp[i] = Integer.max(count[i]*i+dp[i-2],dp[i-1]);
    }
    return dp[max];
}
}
