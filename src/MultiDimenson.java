import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimenson {
    public static void main(String[] args) {
        /*
        1 2 3
        4 5 6
        7 8 9


         */
        Scanner sc = new Scanner(System.in);
       // int[][] arr = new int[3][];

       //   int[][] arr2D ={
        //        {1, 2, 3}, //0th index
          //      {4, 5},    //1st index
               // {6, 7, 8, 9}   //2nd index -> arr2D[2] = {6, 7, 8, 9}

       // };
        int[][] arr = new int[3][3];
      //  System.out.println(arr.length);
        // input
        for(int row = 0; row <arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }

        }
        // output

        //  for(int row =0; row< arr.length; row++){
        //          for(int col=0; col< arr[row].length; col++){
        //           System.out.print(arr[row][col] + " ");
        //      }
        //    System.out.println();
        //    }


      //  for(int row= 0; row<arr.length; row++){
      //      System.out.println(Arrays.toString(arr[row]));
      //  }
     for(int[] row : arr){
         System.out.println(Arrays.toString(row));
     }

    }
}
