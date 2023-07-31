package Normal;
import java.util.*;
public class camelCase {
    public static void main(String[]args){
        try{
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            func(str);
        }catch(Exception e){
            System.out.println(-1);
        }
    }
    public static void func(String str){
       
        // int flag =0;
        // if(Character.isLowerCase(str.charAt(0))) flag = 0;
        // else flag =1;

        for(int i =0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                System.out.println();
                System.out.print(Character.toLowerCase(str.charAt(i)));
                
            }else{
                System.out.print(Character.toUpperCase(str.charAt(i)));
            }
        }
    }
}
