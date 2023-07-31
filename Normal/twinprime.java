package Normal;


public class twinprime{
    public static void main(String[]args){
    int n = 100;
    // System.out.println(twin(n));

    for(int i=0;i<n;i++){
        if(isPrime(i)&&isPrime(i+2)){
            System.out.println("{ "+i+", "+(i+2)+'}');
        }
    }
}

public static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    
    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false;
        }
    }
    
    return true;
}
}
