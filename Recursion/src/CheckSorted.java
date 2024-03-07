public class CheckSorted {

    public static boolean ifsorted(int[] arr, int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
       return ifsorted(arr,i+1);
    }
    public static void main(String[] args){
int[] arr ={1,2,3,5,4};
        System.out.println(ifsorted(arr,0));
    }
}
