import java.util.ArrayList;

public class MaxWater {
//    public static int storeWater(ArrayList<Integer>height){
//        int maxWater = 0;
//        for(int i=0; i<height.size(); i++){
//            int l1 = height.get(i);
//            for(int j=i+1; j<height.size(); j++){
//                int l2 = height.get(j);
//
//                int ht = Math.min(l1,l2);
//                int width = j-i;
//                int water = ht*width;
//                maxWater = Math.max(water,maxWater);
//            }
//        }
//return maxWater;


    // 2 pointer approach
    public static int optStoreWater(ArrayList<Integer> height){
        int maxWater = 0;

        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            // calculate current water level
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
             maxWater = Math.max(currWater,maxWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
       }
    public static void main(String[] args){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(optStoreWater(height));
    }
}
