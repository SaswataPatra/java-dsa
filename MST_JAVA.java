// import java.util.*;
// import java.util.Iterator;
// public class MST_JAVA {
//     public static void main(String[] args) {
       
            
//         String s1 = args[1];

//         String s2 = args[2];
        
//         String s3 = args[3];
        
//         String s4 = args[4];
        
//         System.out.print(" args[2] = " + s2);
            
           
//         // HashSet<String> h_set = new HashSet<String>();
//         // h_set.add("Red");
//         // h_set.add("Green");
//         // h_set.add("Black");
//         // h_set.add("White");
//         // h_set.add("Pink"); 
//         // h_set.add("Yellow");
        
        
//         // Iterator<String> p=h_set.iterator();  
//         // System.out.println("BEFORE CLEARING THE HASHSET");
//         // while (p.hasNext()) { 
//         //     System.out.println(p.next());
//         // }
        
//         // while (p.hasNext()) { 
//         //     System.out.println(p.next());
//         // }
//         // String arr[] = new String[h_set.size()];
//         // int i =0;
//         // for(String items:h_set){
//         //     arr[i++] = items;
//         //   }
//         // System.out.println("HASH SET TO ARRAY METHOD-1");
//         // for ( int j =0 ;j<h_set.size();j++){
//         //     System.out.println(arr[j]);
//         // }
//         // String arr1[] = new String[h_set.size()];
//         // h_set.toArray(arr1);

//         // System.out.println("HASH SET TO ARRAY METHOD-2");

//         // for ( String items : arr1){
//         //     System.out.println(items);
//         // }

//         // System.out.println("AFTER CLEARING THE HASHSET \n");
//         // h_set.clear();
    
// }
// }

// A divide and conquer solution to find count of zeroes in an array
// where all 1s are present before all 0s

class CountZeros
{
	/* if 0 is present in arr[] then returns the index of FIRST occurrence
	of 0 in arr[low..high], otherwise returns -1 */
	int firstZero(int arr[], int low, int high)
	{
		if (high >= low)
		{
			// Check if mid element is first 0
			int mid = low + (high - low) / 2;
			if ((mid == 0 || arr[mid - 1] == 1) && arr[mid] == 0)
				return mid;

			if (arr[mid] == 1) // If mid element is not 0
				return firstZero(arr, (mid + 1), high);
			else // If mid element is 0, but not first 0
				return firstZero(arr, low, (mid - 1));
		}
		return -1;
	}

	// A wrapper over recursive function firstZero()
	int countZeroes(int arr[], int n)
	{
		// Find index of first zero in given array
		int first = firstZero(arr, 0, n - 1);

		// If 0 is not present at all, return 0
		if (first == -1)
			return 0;

		return (n - first);
	}

	// Driver program to test above functions
	public static void main(String[] args)
	{
		CountZeros count = new CountZeros();
		int arr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int n = arr.length;
		System.out.println("Count of zeroes is " + count.countZeroes(arr, n));
	}
}

