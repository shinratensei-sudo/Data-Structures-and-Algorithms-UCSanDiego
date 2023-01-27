import java.util.*;


public class fibonaccinaivesolution {
    public static void main(String[] args) {

        Scanner inputObject = new Scanner(System.in);
        long inputUser = inputObject.nextLong();
        
        
        for(int numeros = 0; numeros <= inputUser  ; numeros += 1){   
            long result = fibonacci(numeros);
            System.out.print(result + " ");
        }

    }

    public static long fibonacci(long k) {
        if (k <= 1) {
            return k;
        } else {
            return fibonacci(k-1) + fibonacci(k-2);
        } 
    }
}
