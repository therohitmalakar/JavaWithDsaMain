import java.util.ArrayList;
import java.util.Scanner;

public class PairSum {

//    public static void pairSum(ArrayList<Integer>list, int target){
//
//        for(int i=0; i<list.size(); i++){
//            for(int j=i+1; j<list.size(); j++){
//                if(list.get(i) + list.get(j) == target){
//                    System.out.print("The index is: ("+i+","+j+")");
//                }
//            }
//            System.out.println();
//        }

    //2 pointers approach
    public static void pairSum(ArrayList<Integer> list, int target){
        int lp =0;
        int rp = list.size()-1;

        while(lp<rp){
            if(list.get(lp) + list.get(rp) == target){
                System.out.println("The index is: ("+lp+","+rp+")");

            }

            //case 2
            if (list.get(lp)+list.get(rp) < target) {
                lp++;
            }
            else{
                rp--;
            }
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        Scanner sc =  new Scanner(System.in);
        int target = 5;
        pairSum(list,target);

    }
}
