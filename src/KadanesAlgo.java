public class KadanesAlgo {
     public static void main(String[] args){

         int[] numbers = {1,-2,6,-1,3};

         kadanes(numbers);

     }
     // this method is not useful if all the integer present in array are negative, then you have to apply some special
     // condition to execute the code.
     public static void kadanes(int[] numbers){

         int ms = Integer.MIN_VALUE;
         int cs = 0;

         for(int i=0; i<numbers.length; i++){
             cs = cs+numbers[i];
             if(cs < 0){
                 cs=0;
             }
             ms= Math.max(cs,ms);
         }
         System.out.println("max Subarray sum is:"+ms);
     }
}
