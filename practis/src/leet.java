import java.util.Arrays;
public class leet {
    public static int removeDuplicates(int[] nums) {

        int[] Arr = new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                Arr[i] = nums[i];
            }
        }
        System.out.println(Arrays.toString(Arr));
        return 0;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2};
        removeDuplicates(nums);
    }
    }

