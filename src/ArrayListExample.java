import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);


//        list.add(484);
//        list.add(554);
//        list.add(78);
//        list.add(55);
//        list.add(48);
//        list.add(5889);
//
//        System.out.println(list);
//       // System.out.println(list.contains(55));
//
//        list.set(0, 99);  // set is used to update the list
//
//        // list.remove(index:2);
//
//        System.out.println(list);

        //input

        for (int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
        // get item at any index
        for(int i=0; i<5; i++){
            System.out.print(list.get(i) + " "); //  pass index here, list[index] syntax will not work here
        }
        System.out.println();
    }
}
