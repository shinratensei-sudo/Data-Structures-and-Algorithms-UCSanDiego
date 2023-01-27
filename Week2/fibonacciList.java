import java.util.*;


public class fibonacciList {
    public static void main(String[] args) {


        Scanner inputObject = new Scanner(System.in);
        
        //read the position of the number that user wants to find
        int inputUser = inputObject.nextInt();
        
        //get the array until the nth term of the fibonacci sequence. To do this, we call the function fibonacci and uses the input of user as parameter
        long[] result = fibonacci(inputUser);
        System.out.println(Arrays.toString(result));


    }

    public static long [] fibonacci(int k) {
        //create an array of the length that user wants
        long[] arr;
        arr = new long[k];
        //the first two elements are 0 and 1
        arr[0] = 0L;
        arr[1] = 1L;
           
        //from 2nd index in the array, get the next one by summing the two previous ones 
        for(int i = 2; i<k; i+=1){
            arr[i] = arr[(i-1)] + arr[(i-2)];
        }
        return arr;

    }
}
