import java.sql.SQLOutput;
import java.util.*;

public class LinearSearch {

    public static int linearSearch(int[] numbers, int key){
        for(int i=0; i<=numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1,5,6,9,8,10,12};
        int key = sc.nextInt();

        int index = linearSearch(numbers, key);

        if(index == -1){
            System.out.print("Not found");

        }
        else {
            System.out.print("the index is:" +index);
        }

    }
}
