import java.util.*;
public class SpecialArray {
    public static int specialSum(int m[], int N) 
    {   int ans [] = new int[N];
        for (int j = 0; j<m.length-2; j++){
            if ( check_cond(m,j,m[j])){
                ans[j] = m[j];
            } else{
                ans[j] = m[j+1];
            }
        }
        ans[N-1]=m[N-1];
        ans[N-2]=m[N-2];
        int max_sum = Arrays.stream(ans).sum();
        return max_sum;
    } 
    public static boolean check_cond(int m[],int j,int chk){
        if ( m[j]<=m[j+1] || m[j+1]>m[j+2]){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        int m[]= {1,5,3,5,4,3,8};
        System.out.println(specialSum(m,m.length));
    }
}
