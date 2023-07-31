import java.util.Arrays;
import java.util.*;
public class MergeIntervals {
    public static void main(String []args){
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};

        int non_overlap[][] = merge_intervals(arr);
        for(int i=0;i<non_overlap.length;i++){
            for(int j =0;j<2;j++){
                System.out.print(non_overlap[i][j]+ ",");
            }
            System.out.println(" ");
        }
    }
    public static int[][] merge_intervals(int[][]intervals){
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       List<int[]> merged = new ArrayList<>();
        
       for ( int i =1; i<intervals.length; i++){
        if ( intervals[i][1]>= intervals[i-1][1]){
            merged
        }
       }
       return merged.toArray(new int[merged.size()][]);

    }
}
