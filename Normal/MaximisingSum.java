package Normal;
class MaximisingSum {
    public static long solve(int N, long[] A) {
        long max=-Long.MAX_VALUE,sum=0,K=0;
        for(int i =0;i<N;i++){
            int k = i+1;
            for(int j =i; j<N; j=j+k){
                sum += A[j];
            }
            if (max<sum){
                max = sum;
                sum = 0;
                K=k;
            }
        }
        return K;
      }

      public static void main(String[] args){
        long A[] = {-3, -2, -1};
        long ans = solve(A.length,A);
        System.out.println(ans);
      }
  }