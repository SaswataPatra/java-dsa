package recursion;

public class palindrome {
    public static void main(String[] args) {
        String str = "racecarsss";

        System.out.println(rec(str)?"its palin":"its not palin");
    }

    public static boolean rec(String input) {
        if (input.length() == 0 || input.length() == 1) {
            return true;
        }
        if (input.substring(0, 1).equals(input.substring(input.length() - 1))) {
            return rec(input.substring(1,input.length()-1));
        }
        return false;
    }
}
