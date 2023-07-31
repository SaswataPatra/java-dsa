package Strings;

public class ValidPalin {
    public static void main(String[]args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\p{Punct}", "").replaceAll(" ", "").toLowerCase();
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);  
        String res = sb.reverse().toString();
        if ( res.equals(s)) return true;
        return false;
    }

}
