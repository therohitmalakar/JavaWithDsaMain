public class SumNatural {

    public static int printSum(int n){
        if(n == 1){
            return 1;
        }
        int nSumm1 =printSum(n-1);
        int nSum = n + printSum(n-1);
        return nSum;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(printSum(n));
    }
}
