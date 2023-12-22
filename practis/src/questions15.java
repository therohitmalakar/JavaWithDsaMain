//folder 15 questions solved
  public class questions15 {

    //question 1
    public static void q1(int[][] matrix){
        int key = 7;
        int number = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(key == matrix[i][j]){
                    number++;
                }
            }
        }
        System.out.println("the no. of keys are:"+number);
    }

    //Question 2
    public static void q2(int[][] nums){
        int sum =0;
            for(int j=0; j<nums[0].length; j++){
                sum+= nums[1][j];
            }
        System.out.println("the sum is:"+sum);
        }

    public static void main(String[] args){
        int[][] matrix = {{4,7,8},
                          {8,8,7}};

        int[][] nums = {{1,4,9},
                       {11,4,3},
                       {2,2,3}};

        int[][] transp = {{2,3,7},
                          {5,6,7}};
        //q1(matrix);
        q2(nums);
    }
}
