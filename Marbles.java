import java.util.*;
public class Marbles {

    public static void main (String[] args) throws java.lang.Exception
	{
        // Scanner sc = new Scanner(System.in);
 
        // // Declaring and initializing an array of size 10
        // int i,T,N;
        // T = sc.nextInt();
        // // Loop to store input values in nums array
        // for (i = 0; i < T; i++) {
        //     N = sc.nextInt();
        //     String []str = new String[2];
        //     for(int j =0 ;j<2;j++){
        //         str[j] = sc.next();
        //     }
        //     find_max_profit(N,str);
        // }
        String[] str = new String[]{"abcde?","ehio??"};
        find_max_profit(6,str);
	}
    public static void find_max_profit(int N, String[] str)
{
String S = str[0];
String P = str[1],str_1="", str2="";

for ( int i =0; i<N;i++){
    if ( S.charAt(i)=='?'){
        str2 = str2 + S.charAt(i);
    }
    if (P.charAt(i)=='?'){
        s
    }
}

System.out.println(count);
}   

public static int findSum( String S, String P){
    int sum =0;
    for ( int i =0; i<S.length(); i++){
    if ((isVowel(S.charAt(i)) && isVowel(P.charAt(i))||!isVowel(S.charAt(i))&& !isVowel(S.charAt(i)))){
        sum= sum+2;
    }
    else{
        sum++;
    }
    }
    return sum;
}

public static boolean isVowel(char ch){
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
    return true;
        else
        return false;
}
}
