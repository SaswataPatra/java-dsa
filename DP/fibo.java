public class fibo {
    public static void main(String[] args){
        System.out.println(fib(4));
        }
    public static int fib(int n){
        if ( n <=1) return n;
        int t1 = fib(n-1);
        int t2 = fib(n-2);
        return t1 + t2;
    }
}
