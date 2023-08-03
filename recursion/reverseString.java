package recursion;

public class reverseString {
    public static void main(String[]args){

    String input = "hello world";
    System.out.println(rec(input));
    }

    public static String rec(String input){
        if(input.equals("")){
            return "";
        }
        return rec(input.substring(1,input.length()))+input.charAt(0);
    }
}
