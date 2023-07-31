public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";    
            return longestCommonPrefix(strs, 0 , strs.length - 1);
    }
    
    private static String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        }
        else {
            int mid = (l + r)/2;
            String lcpLeft =   longestCommonPrefix(strs, l , mid);
            String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
            return commonPrefix(lcpLeft, lcpRight);
       }
    }
    
    static String commonPrefix(String left,String right) {
        int min = Math.min(left.length(), right.length());       
        for (int i = 0; i < min; i++) {
            if ( left.charAt(i) != right.charAt(i) )
                return left.substring(0, i);
        }
        return left.substring(0, min);
    }
    // public static Boolean check_equality(String s,String com_str){
    // int flag=0;
    // for (int i=0;i<s.length();i++){
    // if (s.contains(com_str)){
    // continue;
    // }else{
    // flag=1;
    // break;
    // }
    // }
    // if (flag==0) return true;
    // else
    // return false;
    // }

    public static void main(String[] args) {
        // IntToRoman(58,ans);
        String a[] = new String[] { "fight","flows","flower" };
        String s = longestCommonPrefix(a);
        System.out.println("The longest Common Prefix is :" + s);
    }
}
