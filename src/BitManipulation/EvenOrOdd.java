package BitManipulation;

public class EvenOrOdd {

    public static void evenOrOdd(int n){

        int bitmask = 1;

        if((n & bitmask) == 0){
            //even number
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args){

        evenOrOdd(3);
    }
}
