import java.util.ArrayList;

import java.util.*;
public class SummaryRanges {
    // public static ArrayList<String> summaryRanges(int[] nums) {
    //     ArrayList<String> soln_array = new ArrayList<>();
    //     String soln_string="";
    //     int start = 0,end=0;
    //     if ( nums.length!=0){
    //         start = nums[0];
    //         end = nums[0];
    //     }
    //     for ( int i =1 ;i<=nums.length; i++){
    //         if ( i == nums.length){
    //             soln_string = find_soln_string(start,end);
    //             soln_array.add(soln_string);
    //         }else{
    //         if ( nums[i]-nums[i-1]==1){
    //             end = nums[i];
    //             continue;
    //         }else{
    //             soln_string = find_soln_string(start, end);
    //             soln_array.add(soln_string);
    //             start = nums[i];
    //             end = nums[i];        
    //         }
    //     }
    // }
    //     return soln_array;
    // }
    // public static String find_soln_string(int start, int end){
    //     String soln_string;
    //     if (start!=end){
    //         soln_string = String.valueOf(start) + "->" + String.valueOf(end);
    //     }else{
    //         soln_string = String.valueOf(start);
    //     }
    //     return soln_string;
    // }

    public static ArrayList<String> summaryRanges(int[]nums){
        ArrayList<String> ans = new ArrayList<>();
        int n = nums.length;
        if(n==0) return ans;
        int start=0,end =0;
        String str="";
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1){
                end = i;
                continue;
            }else{
                if(start==end){
                    str = String.valueOf(nums[start]);
                }else if (start!=end){
                    // if(!ans.isEmpty())
                    //    start=start+1;
                    str = String.valueOf(nums[start]) +"->"+ String.valueOf(nums[end]);
                }
                start=end+1;
                end = start;
                ans.add(str);
            }
        }
        if(start==end){
            str = String.valueOf(nums[nums.length-1]);
        }else{
            str = String.valueOf(nums[start]) +"->"+ String.valueOf(nums[end]);
        }
        ans.add(str);
        return ans;
    }
    public static void main(String[]args){
        int [] nums = {1,2};
        ArrayList<String> soln_array = new ArrayList<>();
        soln_array = summaryRanges(nums);
        for (String soln : soln_array){
            System.out.print(soln + " ");
        }

    }
}
