public class SearchInRotatedArray {

    public static int search(int[] arr, int target, int si, int ei){

       int mid = si+(ei - si)/2;

       //Base Case
        if(si > ei){
            return -1;
        }

        //Found
        if(arr[mid] == target){
            return mid;
        }

        //Case 1: on L1
        if(arr[si] <= arr[mid]){

            //case a: on left
            if(arr[si] <= target && target <= arr[mid-1]){
               return search(arr,target,si,mid-1);
            }
            else{ // Case b: on right
              return  search(arr,target,mid+1,ei);

            }
        }

        //Case 2: on L2
        else{
            //Case c: on right
            if(arr[mid+1] <= target && target <= ei){
               return search(arr,target,mid+1,ei);
            }
            //Case d: on left
            else{
                return search(arr,target,si,mid-1);
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        int targetIdx = search(arr,target,0,arr.length-1);
        System.out.println(targetIdx);
    }
}
