import java.util.ArrayList;
public class RevofAL {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        for(int i = list.size()-1; i>=0; i--){
//            System.out.print(list.get(i));
//        }

        // max in al
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
