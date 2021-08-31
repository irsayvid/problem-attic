package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//19. [Maximum Population Year](https://leetcode.com/problems/maximum-population-year/)
public class MaxPopulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num of rows: ");
        int rows = in.nextInt();
        int[][] logs = new int[rows][2];
        for (int i=0; i < rows; i++){
            System.out.print("Enter birth and death year in row "+(i+1)+": ");
            for (int j=0; j < 2; j++) {
                logs[i][j] = in.nextInt();
            }
        }
        System.out.println("Max population count: "+ maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int[] peopleInRange = new int[101];
        for (int i = 0; i < logs.length; i++){
            includeAlive(peopleInRange, logs[i][0]-1950, logs[i][1]-1950);
        }
        int max =0, year = 1950;
        for (int j = 0; j < 101; j++){
            if(peopleInRange[j] > max){
                max = peopleInRange[j];
                year = j+1950;
            }
        }
        return year;
    }
    public static void includeAlive(int[] arr, int start, int end){
        for (int i = start; i < end; i++){
            arr[i]++;
        }
    }

}
