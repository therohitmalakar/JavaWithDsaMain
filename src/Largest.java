
public class Largest {

    public static int getLargest(int[] numbers){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("the smallest number is:" +smallest);
        return largest;
    }
    public static void main(String[] args){

        int[] numbers = {2,4,6,8,9,12,20,25};

        System.out.println("the largest number is: " + getLargest(numbers));
    }
}
