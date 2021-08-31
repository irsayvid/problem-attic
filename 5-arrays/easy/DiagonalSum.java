package easy;// 15. [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)

import java.util.Scanner;

public class DiagonalSum {
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
        System.out.println("Sum along diagonals: "+ diagonalSum(matrix));
    }
    public static int diagonalSum(int[][] mat) {
        int len = mat.length, sum = 0;
        for(int i = 0; i < len; i++){
            int j = len-i-1;
            if(i != j)
            {
                sum += mat[i][j];
            }
            sum += mat[i][i];
        }
        return sum;
    }
}
