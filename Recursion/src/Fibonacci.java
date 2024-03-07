public class Fibonacci {
    public static void main(String[] args){
        int n = 6;
        System.out.print(fibo(n));
    }
    public static int fibo(int n){
        if(n== 0 || n==1){
            return n;
        }
       int fiNm1 = fibo(n-1);
       int fiNm2 = fibo(n-2);
       int fiN = fiNm1 + fiNm2;
       return fiN;

    }
}
