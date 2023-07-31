package Normal;
import java.util.*;
public class RomanToInt {
    public static String ans=""; 
    public static Integer sum=0;
    public static int IntToRoman(int x,String ans) {
        
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");

        ArrayList<Integer> keys = new ArrayList<Integer>(map.keySet());
        for(int i=keys.size()-1; i>=0;i--){
            if (keys.get(i)<=x){
                ans+=map.get(keys.get(i));
                return IntToRoman(x-keys.get(i),ans);

            }
        }
        System.out.println(ans);
        return 0;
    
    }
    public static void romanToInt(String s) {
        int val1, val2;
        int sum=0;
        Map<Character,Integer> map = new TreeMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);


        for (int i = 0; i<s.length();){
                val1 = map.get(s.charAt(i));
                if (i!= s.length()-1){
                    val2 = map.get(s.charAt(i+1));
                    System.out.println("Sum = "+ sum + " val1 = " + val1 + " val2 = " + val2 + " i = "+i);
                    if (val1<val2){
                        sum += val2-val1;
                        i++;
                    }else{
                        sum += val1 ; 
                    }
                }else{
                    sum += val1;
                }
                i++;
                System.out.println("Sum : "+sum);
            }
            System.out.println("Roman to int :"+sum);
        }
    public static void main(String[] args) {
        // IntToRoman(58,ans);
        romanToInt("LVIII");
    }

}
