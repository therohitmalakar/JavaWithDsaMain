public class Search2D {
    //Brute force
        public static void worstSearch(int[][] matrix) {
        int key = 35;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    System.out.print("key found at" + "(" + i + "," + j + ")");
                }
            }
            System.out.println();
        }
    }
    //stair case
     public static boolean optimizeSearch(int[][] matrix) {
         int key = 33;
         int row = 0;
         int col = matrix[0].length-1;

         while ( row < matrix.length && col >= 0 ){
             if (matrix[row][col] == key) {
                 System.out.print("key found at" + "(" + row + "," + col + ")");
                 return true;
             } else if (key < matrix[row][col]) {
                 col--;
             } else {
                 row++;
             }
         }
         System.out.println("key not found");
         return false;
     }

    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        optimizeSearch(matrix);
    }
}
