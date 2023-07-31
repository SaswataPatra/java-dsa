package recursion;

public class reverseArray {
    public static void main(String[]args){
        int n[]={1,2,3,4,5};
        rec(n,0,n.length-1);
        for(int i =0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }

    public static void rec(int[]n,int l, int r){
        if (l>=r) return;

        int temp = n[l];
        n[l] = n[r];
        n[r] = temp;
        rec(n, l+1, r-1);
    }
}
