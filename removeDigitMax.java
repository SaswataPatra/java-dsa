// import java.math.BigDecimal;
import java.util.*;

public class removeDigitMax {
    public static void main(String[]args){
        String str = "123";
        char digit = '3';

        System.out.println(removeDigit(str,digit));
    }

    // public static String removeDigit(String number, char digit) {
    //     double max=Double.MIN_VALUE;
    //     for(int i=0;i<number.length();i++){
    //         if(number.charAt(i)==digit){
    //             String str =number.substring(0,i)+number.substring(i+1,number.length());
    //             double tmp = Double.parseDouble(str);
    //             if(max<tmp) max = tmp;
    //         }
    //     }
     
    //     number = BigDecimal.valueOf(max).toPlainString();
    //     if(number.contains(".0")){
    //         return number.substring(0,number.length()-2);
    //     }
    //     return number.substring(0,number.length());
    // }

    public static String removeDigit(String number, char digit) {   
        List<String> digits = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String stringWithoutDigit = number.substring(0, i) + number.substring(i + 1);
                digits.add(stringWithoutDigit);
            }
        }        
        Collections.sort(digits);
        return digits.get(digits.size() - 1);
    }
}
