public class FirstOccurence {
    public static int returnIndex(int[] arr, int k, int i){
        if(i == arr.length){
            return -1;
        }
        if(k == arr[i]){
            return i;
        }
        return returnIndex(arr,k,i+1);
    }

    public static int lastOccurence(int[] arr, int k, int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastOccurence(arr,k,i+1);
        if(arr[i] == k && isfound == -1){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args){
        int[] arr = {8,3,6,9,5,10,2,5,3};
        System.out.println(returnIndex(arr,3,1));
    }
}
