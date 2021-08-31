package easy;// 23. [Saddle Point In Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] numbers = new int[rows][cols];
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < cols; j++) {
                numbers[i][j] = in.nextInt();
            }
        }
        System.out.println("Lucky Number(s): "+ luckyNumbers(numbers));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int[] maxInColumns = new int[matrix[0].length];
        int max;
        for (int i = 0; i < matrix[0].length; i++){
            max = matrix[0][i];
            for(int j = 0; j < matrix.length; j++){
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                }
            }
            maxInColumns[i] = max;
        }
        int min, index;
        for(int i = 0; i < matrix.length; i++){
            min = matrix[i][0];
            index = 0;
            for (int j = 0; j < matrix[0].length; j++){
                if (min > matrix[i][j]){
                    index = j;
                    min = matrix[i][j];
                }
            }
            if (min == maxInColumns[index]){
                res.add(min);
            }
        }
        return res;
    }
}
