package Normal;
import java.util.*;
public class greenRedLight {
    public static void main (String[] args) throws java.lang.Exception
	{
        try{
        Scanner sc = new Scanner(System.in);
 
        // Declaring and initializing an array of size 10
        int i,T,N,K;
        T = sc.nextInt();
        // Loop to store input values in nums array
        for (i = 0; i < T; i++) {
            N = sc.nextInt();
            K = sc.nextInt();
            int[] nums = new int[N];
            for( int j = 0;j<N;j++){
                nums[j] = sc.nextInt();
            }
            find_greater_height(nums,N,K);
        }
    }
    catch(Exception e){
        return;
    }
	}
    public static void find_greater_height(int[] nums, int N, int K){
        int count=0;
        for(int i = 0; i< N; i++){
            if (nums[i]>K){
                count++;
            }
        }
        System.out.println(count);
    }
}
