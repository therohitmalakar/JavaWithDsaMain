import java.util.*;
public class ageFunc {
     public static int elgVote(int age){

         if( age>= 18){
             System.out.println("Eligible to vote");
         }
         else{
             System.out.println("Not eligible to vote");
         }
         return age;
     }

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int a = sc.nextInt();


         int age = elgVote(a);
    }
}
