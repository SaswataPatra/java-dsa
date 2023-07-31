package Normal;
import java.util.*;

import javax.swing.event.SwingPropertyChangeSupport;
public class builderBuffer {
    public static void main(String[]args){
        // String word = "";
        // // StringBuffer sb = new StringBuffer(word);
        // // // sb.insert(2, 'x');
        // // sb.deleteCharAt(2);
        // // System.out.println(word);
        // // System.out.println(sb.toString());

        // if (word.equals("")) System.out.println("true");
        // else System.out.println("false");
        // int i = 17;
        // System.out.println('1'-'0');
        // String str = "baba";
        // System.out.println(str.substring(0,1));
        // StringBuilder sb = new StringBuilder(str) ;
        // System.out.println(sb.reverse());
        // if(str.equals(sb.toString())) System.out.println("Hello");
        // else System.out.println("Mello");
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for(int i=4;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

//         for(int i=3;i<15;i+=3){
// System.out.println(i);
// ++i;
//         }

    // int i =0;
    // int j=2;
    // do{
    //     i++;
    //     j++;
    //     System.out.println("hello");

    // }while(j<5);
    int a[] = {2,2,1,1,1,2,2,1,2,1};
    int fc = a.length/2;
    int count=0;
    for(int num:a){
         count =0;
        for(int elem:a){
            count += 1;

        }
    }
    System.out.println("Count"+count);
    if(count>fc){
        System.out.print(1);
    }
    else{
        System.out.println(-1);
    }
    }
}
