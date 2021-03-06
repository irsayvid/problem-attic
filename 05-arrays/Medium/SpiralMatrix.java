package Medium;
//1. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class SpiralMatrix {
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
        System.out.println("Max wealth: "+ spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int minR = 0, minC = 0, maxR = matrix.length-1, maxC = matrix[0].length-1, count = (maxR+1)*(maxC+1);
        while (count > 0){
            for (int i = minR, j = minC; j <= maxC && count > 0; j++){
                res.add(matrix[i][j]);
                count --;
            }
            minR++;
            for (int i = minR, j = maxC; i <= maxR && count > 0; i++){
                res.add(matrix[i][j]);
                count --;
            }
            maxC--;
            for (int i = maxR, j = maxC; j >= minC && count > 0; j--){
                res.add(matrix[i][j]);
                count --;
            }
            maxR--;
                for (int i = maxR, j = minC; i >= minR && count > 0; i--){
                res.add(matrix[i][j]);
                count --;
            }
            minC++;
        }
        return res;
    }
}
