package Strings;

import java.util.Hashtable;
import java.util.Arrays;
public class Anagram {

    public static void main(String[]args){
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));
    }
//METHOD 1 --HASH TABLE
//     public static boolean isAnagram(String s, String t) {
//         Hashtable<Character,Integer> htable = new Hashtable<>();

//         for(int i=0;i<s.length();i++){
//             char c = s.charAt(i);
//             if(!htable.containsKey(c)){
//                 htable.put(c, 1);
//             }else{
//                 htable.put(c,htable.get(c)+1);
//             }
//         }
//         for(int i=0;i<t.length();i++){
//             char c = t.charAt(i);
//             if(!htable.containsKey(c)) return false;
//             else{
//                 int tmp = htable.get(c);
//                 if(tmp>1){
//                     htable.put(c, tmp-1);
//                 }else{
//                     htable.remove(c);
//                 }
//             }
//         }
//         if(htable.isEmpty()) return true;
//         return false;
//     }

//USING SORTING

public static boolean isAnagram(String s, String t) {
    char ss[] = s.toCharArray();
    char tt[] = t.toCharArray();

    Arrays.sort(ss);
    Arrays.sort(tt);
    s = ss.toString();
    t= tt.toString();
    return Arrays.toString(ss).equals(Arrays.toString(tt))?true:false;
}
    
}
