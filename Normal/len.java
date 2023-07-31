package Normal;
//compare two strings
//
public class len {
    public static void main(String[]args){
        String st = "hello world";
        int i =0;
        String str="";
        while(!st.equals(str)){
            str = str + st.charAt(i);
            i++;
        }
        System.out.println(i);
    }
}
