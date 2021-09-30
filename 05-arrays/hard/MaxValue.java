package hard;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] ordinates = new int[rows][cols];
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < cols; j++) {
                ordinates[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter constraint k: ");
        int k = in.nextInt();
        System.out.println("Max value of equation: "+ findMaxValueOfEquation(ordinates, k));
    }
    public static int findMaxValueOfEquation(int[][] points, int k) {
        int max = Integer.MIN_VALUE, temp;
        for(int i = 0; i < points.length-1; i++){
            for(int j = i+1; j < points.length; j++){
                if (Math.abs(points[i][0] - points[j][0]) > k) break;
                temp = Math.abs(points[i][0] - points[j][0]) + points[i][1] + points[j][1];
                if (temp > max) max = temp;
            }
        }
        return max;
    }
}
