
import java.util.*;
public class funFactorial {
    public static int factorial(int n){

        int f = 1;
        for(int i =1; i<=n; i++){
           f =  f*i;

        }
        return f;
    }
    public static int binCoef(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int binCoef = n_fact / (r_fact * nmr_fact);
        return binCoef;
    }

    // to calculate int sum

    public static int sum(int a, int b){
        return a+b;
    }
    // to calculate float sum
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args){

        System.out.println(sum(3,4));
        System.out.println(sum(3.2f,4.5f));
    }
}
