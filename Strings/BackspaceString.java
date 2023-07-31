package Strings;

public class BackspaceString {
    public static void main(String[]args){
        String s = "#abc#";
        String t = "c#d#";

        System.out.println(backspaceCompare(s,t));
    }

    public static boolean backspaceCompare(String s, String t) {
        

        s = afterRemoval(s);
        t = afterRemoval(t);
        if (s.equals(t)) return true;
        else return false;

    }

   static  String afterRemoval(String str){
        int i=0;
        str = str+' ';
        while(str.charAt(i)!=' '){
            if(str.charAt(i)=='#'){
            if(i!=0){
                str = str.substring(0,i-1)+str.substring(i+1,str.length());
                i=i-2;
            }else if(i==0){
                str = str.substring(1,str.length());
                i=i-1;
            }
        }
        i++;
    }
    return str;
    }
}
