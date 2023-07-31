public class Rittik {
    public static void main( String[] args){
        String str = "GGGGBBBGBBGGB";
        int f = find_swaps(str);
        System.out.println(f);
    }
    public static int find_swaps(String str){
        int g_swap=0,b_swap=0,count_swap=0;
        int flag =0, locked_g =0,locked_b =0, for_flag =0;
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        while(flag !=1){
        for ( int i =1; i< str.length()&&for_flag ==0;i++){
            if ( ch[i]==ch[i-1]&&ch[i]=='G'&&locked_g ==0){
                g_swap = i;
                locked_g =1;
            }
            if ( ch[i]==ch[i-1]&&ch[i]=='B'&& locked_b ==0){
                b_swap = i;
                locked_b =1;
            }
            if ( locked_g ==1 && locked_b ==1){
                for_flag =1;
                break;
            }
        }
        locked_g =0;
        locked_b =0;
        if (g_swap!=b_swap && g_swap !=0){
            char tmp = ch[g_swap];
            ch[g_swap] = ch[b_swap];
            ch[b_swap] = tmp;
            count_swap++;
            g_swap = 0;
            b_swap = 0;
        }
        if ( g_swap!=b_swap && (g_swap ==0 || b_swap==0)){
            if ( b_swap ==0){
            char tmp = ch[g_swap];
            ch[g_swap] = ch[str.length()-1];
            ch[str.length()-1] = tmp;
            count_swap++;
            flag =1;
            break;
            }
            if (g_swap ==0){
            char tmp = ch[b_swap];
            ch[b_swap] = ch[str.length()-1];
            ch[str.length()-1] = tmp;
            count_swap++;
            flag =1;
            break;
            }
        }
    }
        return count_swap;
    }

    
}
