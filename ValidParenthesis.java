import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[]args){
        String s = "]";
        System.out.println(isValid(s));
    }
    public static Boolean isValid (String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
                continue;
            }
                char check;
                if(!stack.isEmpty()){
                switch(ch){
                    case(')'):
                    check = stack.pop();
                    if (check=='{'||check=='[') {
                        return false; 
                    }
                    break;
                    case('}'):
                    check = stack.pop();
                    if(check=='('||check=='['){
                        return false;
                    }
                    break;
                    case(']'):
                    check = stack.pop();
                    if(check=='('||check=='{'){
                        return false;
                    }
                    break;
                    default:
                    return false;
                }
            }else return false;
        }
        return stack.isEmpty();
    }
}
