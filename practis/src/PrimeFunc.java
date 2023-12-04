
//check if the number is prime or not with the help of functions
 public class PrimeFunc {

//    public static boolean isPrime(int n){
//        boolean isPrime = true;
//        for(int i=2; i<=n-1; i++){
//
//        {
//            if( n % i == 0){
//                isPrime = false;
//
//                break;
//            }
//        }
//        return isPrime;
//    }

        //optimised loop to solve this problem

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    // to print prime number in a given range

    public static void PrimeInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
      PrimeInRange(20);
    }
}
