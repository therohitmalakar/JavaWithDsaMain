import java.util.Scanner;
public class largest2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        findLargest(matrix);
    }
    public static void findLargest(int[][] matrix){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("largest element is:"+ largest);
        System.out.println("smallest element is:"+ smallest);
    }
}
