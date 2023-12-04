import java.util.*;
public class array {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        String[] str = new String[5];
        for (int i=0; i<str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "Rohit";
        System.out.println(Arrays.toString(str));
    }
}
