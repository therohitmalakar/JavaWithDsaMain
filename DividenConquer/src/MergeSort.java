public class MergeSort {
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    public static void mergeSort(int[] arr, int si, int ei){
        if(ei<=si){
            return;
        }
        //kaam
        int mid = si + (ei-si)/2;  //(si+ei)/2
        mergeSort(arr,si,mid);     //Left
        mergeSort(arr,mid+1,ei); //right
        merge(arr,si,ei,mid);
    }
    public static void merge(int[] arr,int si, int ei,int mid){
       // lets suppose left(0,
        int[] temp = new int[ei-si+1];
       int i = si; //for first sorted part
       int j = mid+1; //for second sorted part
       int k =0; //for temp array

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //for leftOver elements of 1st sorted part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //for leftover elements of 2nd sorted part
        while(j<= ei){
            temp[k++] = arr[j++];
        }
        //copy temp to original array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args){
        int[] arr = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
