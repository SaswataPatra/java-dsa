package DynamicProgramming;

import java.util.*;
public class MaxLengthProd {
    public static void main(String[]args){
        int arr[] = {0,1,-2,-3,-4};
        System.out.println(getMaxLen(arr));
}
public static int getMaxLen(int[] nums) {
  int pos=0,neg =0,result =0;

  for(int i=0;i<nums.length;i++){
      if(nums[i]==0){
          pos=0;
          neg=0;
      }else if(nums[i]>0){
          pos++;
          neg = neg==0?0:neg+1;
      }else{
          int temp =pos;
          pos = neg==0? 0 : neg+1;
          neg = temp+1;
      }
      result = Integer.max(result,pos);
  }
  return result;
}
}
