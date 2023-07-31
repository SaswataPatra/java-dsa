package Normal;
public class palindrome {
    public static boolean isPalindrome(int x){
        if (x<0){
            return false;
        }
        int copy_x = x,digit, rev=0;
        while(copy_x != 0){
            digit = copy_x%10;
            rev = rev*10 + digit;
            copy_x = copy_x/10;
        }
        if (rev==x){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean ans = isPalindrome(1212);
        System.out.println(ans);
    }
}
