import java.util.*;


public class fibonacciList {
    public static void main(String[] args) {


        Scanner inputObject = new Scanner(System.in);
        int inputUser = inputObject.nextInt();

        long[] result = fibonacci(inputUser);
        System.out.println(Arrays.toString(result));


    }

    public static long [] fibonacci(int k) {
        long[] arr;
        arr = new long[k];

        arr[0] = 0L;
        arr[1] = 1L;

        for(int i = 2; i<k; i+=1){
            arr[i] = arr[(i-1)] + arr[(i-2)];
        }
        return arr;

    }
}
