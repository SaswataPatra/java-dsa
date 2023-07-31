package Normal;

public class Day1 {
    public static void main(String[]args){
        int a = 123,b=151,c=6;
        reverse(a);
        armstrong(b);
        perfect(c);
    }
    public static void reverse(int x){
        int n=0;
        while(x!=0){
            int d = x%10;
            n = 10*n+d;
            x /=10;
        }
        System.out.println(n);
    }
    public static void armstromg(int x){
        int copy_x = x, n=0;
        while(x!=0){
            int d = copy_x%10;
            int 
        }
    }
}
