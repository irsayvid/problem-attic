package easy;

import java.util.Scanner;

// 14. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)
public class OddCells {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] accounts = new int[rows][cols];
        System.out.print("Enter num of indices: ");
        int indices_rows = in.nextInt();
        int[][] indices = new int[indices_rows][2];
        for (int i=0; i < indices_rows; i++){
            System.out.print("Enter elements in "+(i+1)+" row: ");
            for (int j=0; j < 2; j++) {
                indices[i][j] = in.nextInt();
            }
        }
        System.out.println("Total number of odd cells: "+ oddCells(rows, cols, indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        int index;
        for (int i = 0; i < indices.length; i++){
            index = indices[i][0];
            for (int j = 0; j < n; j++){
                res[index][j]++;
            }
            index = indices[i][1];
            for (int k= 0; k < m; k++){
                res[k][index]++;
            }
        }
        int count = 0;
        for (int i = 0;i < m;i++){
            for (int j = 0;j < n;j++){
                if(res[i][j] % 2 == 1)
                    count++;
            }
        }
        return count;
    }
}
