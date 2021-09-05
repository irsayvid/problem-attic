//2. [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)
 package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class SetZeroes {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter num of rows: ");
         int rows = in.nextInt();
         System.out.print("Enter num of cols: ");
         int cols = in.nextInt();
         int[][] matrix = new int[rows][cols];
         for (int i=0; i < rows; i++){
          System.out.print("Enter elements in row "+(i+1)+": ");
          for (int j=0; j < cols; j++) {
           matrix[i][j] = in.nextInt();
          }
         }
         setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        int[][] res = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                res[i][j] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (res[i][j] == 0){
                    setRowZero(matrix, i);
                    setColumnZero(matrix, j);
                }
            }
        }
        for (int[] row: matrix){
            System.out.println(Arrays.toString(row));
        }
    }
    public static void setRowZero(int[][] matrix, int row){
        for (int i = row, j = 0; j < matrix[0].length; j++){
            matrix[i][j] = 0;
        }
    }
    public static void setColumnZero(int[][] matrix, int column){
        for (int i = 0, j = column; i < matrix.length; i++){
            matrix[i][j] = 0;
        }
    }
}
