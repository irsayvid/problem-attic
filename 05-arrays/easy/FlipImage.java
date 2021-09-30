package easy;// 13. [Flipping an Image](https://leetcode.com/problems/flipping-an-image/)

import java.util.Arrays;
import java.util.Scanner;

public class FlipImage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter num of cols: ");
        int cols = in.nextInt();
        int[][] image = new int[rows][cols];
        for (int i=0; i < rows; i++){
            System.out.print("Enter elements in row "+(i+1)+": ");
            for (int j=0; j < cols; j++) {
                image[i][j] = in.nextInt();
            }
        }
        System.out.println("Original Image: ");
        for (int[] row:image){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Flipped Image: ");
        image = flipAndInvertImage(image);
        for (int[] row:image){
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
            int rows = image.length;
            for (int i = 0; i < rows; i++){
                int start = 0;
                int end = image[i].length-1;

                while(start <= end) {
                    int temp = invert(image[i][start]);
                    image[i][start] = invert(image[i][end]);
                    image[i][end] = temp;

                    start++;
                    end--;
                }
            }
            return image;
    }
    public static int invert(int n){
        if (n == 0)
            return 1;
        else
            return 0;
    }

}
