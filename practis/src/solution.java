class Solution {

    public static void twoSum(int nums[], int target) {

        for(int i=0; i<nums.length; i++){
            int start = nums[i];
            for(int j=0; j<nums.length; j++){
                if( start + nums[j] == target){
                    System.out.print("("+i+","+j+")");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        twoSum(nums,target);

    }
}