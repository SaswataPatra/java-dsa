public class CountSubset {
    public static void main(String[]args){
        int arr[] = {1, 4, 3, 2}; 
        int sum = 5;
        System.out.println( findNoOfSubsets(arr,arr.length,sum));
        
    }

    static int findNoOfSubsets(int[] A, int N, int sum) {
        // First, we initialize the matrix
        int matrix[][] = new int[N + 1][sum + 1];

        // To initialize the first value of the matrix
        matrix[0][0] = 1;
        for (int k = 1; k <= sum; k++) {
            matrix[0][k] = 0;
        }

        for (int k = 1; k <= N; k++) {
            matrix[k][0] = 1;
        }

        for (int k = 1; k <= N; k++) {
            for (int l = 1; l <= sum; l++) {

                // If element value is greater than the sum value
                if (A[k - 1] > l)
                    matrix[k][l] = matrix[k - 1][l];
                else {
                    matrix[k][l] = matrix[k - 1][l] +
                            matrix[k - 1][l - A[k - 1]];
                }
            }
        }
        for (int i = 0; i <=N; i++)
		{
            for (int j = 0; j <=sum; j++)
			System.out.print(matrix[i][j]+" ");
        System.out.println("");
        System.out.println("");
		} 

        return matrix[N][sum];
    }

}
