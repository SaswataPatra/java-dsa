package Normal;
import java.lang.Math;
public class Codenation3 {
    static int[] check = new int[2];

    public static void main(String[]args){
        String A = "aba";
        int B[] = {-2,0,2};
        int C[] = {1,-1,-1};
        int D = 3;
        System.out.println(solve(A,B,C,D));
     }
    // public static long solve(String A, int[] B, int[] C, int D) {
    //     long sum=0;
    //     for(int i=0;i<D;i++){
    //         change_bPos(B,C,A);
    //     }
    //     for(int i=0;i<B.length;i++){
    //         for(int j =i+1;j<B.length;j++){
    //             sum += Math.abs(B[i]-B[j]);
    //         }
    //     }
    //     return sum;
    // }
    // public static void change_bPos(int[] B,int[] C,String A){
    //     for(int i =0;i<B.length; i++){
    //         B[i] = B[i]+C[i];
    //     }
    //     for(int i=0;i<B.length;i++){
    //         boolean check = check_unique(B,A);
    //         if (!check){
    //             B[i] = B[i]*-1;
    //             C[i] = C[i]*-1;
    //         }
    //     }
    // }
    // public static boolean check_unique(int[]B, String A){
    //     for(int i=0;i<B.length;i++){
    //         for(int j =i+1;j<B.length; j++){
    //             if(A.charAt(i)==A.charAt(j) && B[i]==B[j]){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    public static long solve(String A, int[] B, int[] C, int D) {
        // long sum=0;
        for(int i=0;i<D;i++){
            change_bPos(B,C,A);
        }
        // for(int i=0;i<B.length;i++){
        //     for(int j =i+1;j<B.length;j++){
        //         sum += Math.abs(B[i]-B[j]);
        //     }
        // }

        return check[1];
    }
    public static void change_bPos(int[] B,int[] C,String A){
        for(int i=0;i<B.length; i++){
            B[i] = B[i]+C[i];
        }
        for(int i=0;i<B.length; i++){
            check_unique(B,A,0,0);
            if (check[1]==1)
                B[i] = B[i]*-1;
                C[i] = C[i]*-1;
            }
        }
    public static void check_unique(int[]B, String A,int sum,int flag){
        for(int i=0;i<B.length;i++){
            for(int j =i;j<B.length; j++){
                sum += Math.abs(B[i]-B[j]);
                if( B[i]==B[j]){
                    check[1]=1;
                }
            }
        }
        check[0] =sum;
    }
}
