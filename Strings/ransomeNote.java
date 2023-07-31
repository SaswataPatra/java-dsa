package Strings;

import java.util.Hashtable;

public class ransomeNote {
    public static void main(String[]args){
        String s = "x";
        String t = "";

        System.out.println(canConstruct(s,t));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        Hashtable<Character,Integer> magT = new Hashtable<>();

        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            if(!magT.containsKey(c)){
                magT.put(c,1);
            }else{
                magT.put(c,magT.get(c)+1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(magT.containsKey(c)&&magT.get(c)!=0){
                magT.put(c,magT.get(c)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
