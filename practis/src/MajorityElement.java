public class MajorityElement {

    public static int majority(int[] nums, int size){
        int el =0;
        int count = 0;
        for(int i=0; i<size; i++){
            if(count == 0){
                el = nums[i];
            }
            if(el == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        count =0;
        for(int i=0; i<size; i++){
            if(el == nums[i]){
                count++;
            }
        }

        if(count > size/2){
            return el;
        }else{
            return -1;
        }

    }

    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        int size = nums.length;
        System.out.println(majority(nums,size));
    }
}
