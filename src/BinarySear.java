import java.util.Scanner;

public class BinarySear {

    public static int binarySearch(int[] numbers, int key){

        int start =0 ,end = numbers.length-1;

        while(start <= end){
            int mid = (start + end) /2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid+1;
            }else {
                end = mid-1;

            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers ={2,5,7,9,10,12,25};

        int key = sc.nextInt();

        System.out.println("the index is: " +binarySearch(numbers,key));

    }
}
