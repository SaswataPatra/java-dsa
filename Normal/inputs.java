package Normal;
import java.util.*;
// import java.lang.Math.*;
public class inputs {
    public static void main(String[]args){
        StringBuilder sb = new StringBuilder();

        sb.append("hello");
        if(sb.toString().equals("hello")){
            System.out.println("yes");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(new String(sb));
    }
}
