package Normal;

public class HelloWorld {
    public static void main(String[] args) {
        int i =6,j=4,k=9;
        class2.func(i,j,k);
        System.out.println(k);
    }
    public static void func(String str){
        String Str = "World";
        System.out.println(str);
    }
}
class class2{
    public static void func(int x,int y, int m){
        if(x==5){
            m=y;
        }else{
            m=x;
        }
    }
}