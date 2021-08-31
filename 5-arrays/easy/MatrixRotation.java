package easy;

import java.util.Scanner;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
public class MatrixRotation {
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
        int[][] target = new int[rows][cols];
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < cols; j++) {
                target[i][j] = in.nextInt();
            }
        }
        System.out.println("Is obtainable?: "+ findRotation(matrix, target));
    }
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int j = 0; j < 4; j++){
            mat = rotate(mat);
            if (isEqual(mat, target)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isEqual(int[][] mat, int[][] target){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] rotate(int[][] mat){
        mat = transpose(mat);
        int temp, n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }
        return mat;
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }
}
