package recursion;

public class IBH {
    public static void main(String[] args) {
            // rec(7);    
            System.out.println(fact(10));
    }
    //n to 1
    // public static void rec(int n){
    //     if (n==1) {
    //         System.out.println(1);
    //         return;
    //     }
    //     System.out.println(n);
    //     rec(n-1);
    // }
    // 1 to n 
    public static void rec(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        rec(n-1);
        System.out.println(n);
    }
    public static int fact(int n){
        if (n==1){  
            return 1;
        }
        return n*fact(n-1);
    }
}
