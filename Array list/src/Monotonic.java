import java.util.ArrayList;

public class Monotonic {

    public static boolean monotonic(ArrayList<Integer> nums){

        boolean inc = true;
        boolean dec = true;

        for(int i=0; i<nums.size()-1; i++){

                if(nums.get(i) < nums.get(i+1)){
                    dec = false;
                }
                if( nums.get(i) > nums.get(i+1)){
                    inc = false;
                }
            }
        return inc || dec;
    }
    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);

        System.out.println(monotonic(nums));

    }
}
