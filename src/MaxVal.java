public class MaxVal {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 9, 25};
        System.out.println(maxRange(arr, 1, 3));
    }
    //imagine that arr is not empty
//    static int max(int[] arr){
//        int maxVal = arr[0];
//        for (int i=1; i<arr.length; i++){
//            if( arr[i] > maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
   // }
    // max value in some range
    static int maxRange(int[] arr, int start, int end){

            int maxVal = arr[start];
            for (int i=start; i<end; i++){
                if( arr[i] > maxVal){
                    maxVal = arr[i];
                }
            }
            return maxVal;
    }
}
