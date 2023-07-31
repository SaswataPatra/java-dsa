import java.util.*;
public class SQuidGame {
    public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
 
        // Declaring and initializing an array of size 10
        int i,T,N;
        T = sc.nextInt();
        // Loop to store input values in nums array
        for (i = 0; i < T; i++) {
            N = sc.nextInt();
            int[] nums = new int[N];
            for( int j = 0;j<N;j++){
                nums[j] = sc.nextInt();
            }
            find_max_profit(nums);
        }
	}
    
    public static void find_max_profit(int [] nums){
        int min = Arrays.stream(nums).min().getAsInt();
        int sum = Arrays.stream(nums).sum();
        sum = sum-min;
        System.out.println(sum);
    }
}
