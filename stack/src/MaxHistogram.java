import java.util.Stack;

public class MaxHistogram {

    public static void maxArea(int[] arr){
        int maxArea = 0;
        int[] nsr = new int[arr.length]; //nextSmallerRight
        int[] nsl = new int[arr.length]; //nextSmallerLeft

        //nsr
        Stack<Integer> s =new Stack<>();

        for(int i = arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //nsl
        s =new Stack<>();

        for(int i = 0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //area    width = j-i-1 = nsr[i] -nsl[i] -1
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] -nsl[i] -1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println(maxArea);
    }

    public static void main(String[] args){
        int[] arr = {2,1,5,6,2,3};
        maxArea(arr);
    }
}
