import java.sql.SQLOutput;
import java.util.Scanner;

public class greaterFunc {

    public static int returnGrt(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = returnGrt(a,b);

        System.out.println("the greater num is "+num);

    }
}
