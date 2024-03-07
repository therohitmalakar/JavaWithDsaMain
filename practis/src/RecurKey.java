public class RecurKey {
    public static void printIndex(int[] arr,int idx, int key){
        if(idx == arr.length){
            return;
        }
        if(key == arr[idx]){
            System.out.print(idx+" ");;
        }
          printIndex(arr,idx+1,key);
    }
    public static void main(String[] args){
        int[] arr = {3,2,4,5,6,2,7,2,2};
        int key =2;
        printIndex(arr,0,key);
        System.out.println();
    }
}
