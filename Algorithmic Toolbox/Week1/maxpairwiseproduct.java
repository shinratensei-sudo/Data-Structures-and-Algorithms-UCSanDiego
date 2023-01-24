import java.util.*;
import java.io.*;


public class maxpairwiseproduct {
    
    //get the maximum product
    static long max(int numbers[]) {
        int n = numbers.length;
        //int product = 0;

        long product = 0;

        for (int j=0 ; j<n ; j+=1){
            for (int k=0 ; k<n ; k+=1){
                if (j!= k){
                    if(0 <  numbers[j]*numbers[k]){
                        product  = (long) numbers[j]*numbers[k];
                    }                  
                }
            }
        }
        return product;
    }

    static long getmax(int numbers[]){

        int n = numbers.length;
        int max_index1 = -1;
        for(int i =0;i<n;i+=1){
            if((max_index1 == -1) || (numbers[i] >numbers[max_index1])){
                max_index1 = i;
            }
        }
        int max_index2 = -1;
        for(int j=0; j<n; j+= 1){
            if((j != max_index1)&& ((max_index2 == -1) || (numbers[j] > numbers[max_index2]))){
                max_index2 = j;                
            }
        }

        long product2 = (long) numbers[max_index1]*numbers[max_index2];
        return product2;
    }

    //function to print the product 
    /* 
    void printProduct(int product){
        System.out.println(product);
    }*/


    //ask for the numbers and the array

    
    public static void main(String[] args){
            FastScanner myObj = new FastScanner(System.in);
            
            int quantityofnumbers = myObj.nextInt();
            int[] numbers;
            numbers = new int[quantityofnumbers]; 

            for (int i=0;i<quantityofnumbers;i+=1){
                numbers[i] = myObj.nextInt(); 
            }
            //System.out.println(Arrays.toString(numbers));
            
            System.out.println(getmax(numbers));
        }
    

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
