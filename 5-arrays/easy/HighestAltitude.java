package easy;

import java.util.Arrays;
import java.util.Scanner;

// 12. [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
public class HighestAltitude {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers: ");
        int[] nums = new int[len];
        for (int i=0; i < len; i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Input Array: "+Arrays.toString(nums));
        System.out.println("Highest Altitude: "+ largestAltitude(nums));
    }
    public static int largestAltitude(int[] gain) {
        int len = gain.length;
        int max = 0, sum = 0;
        for (int i=0; i<len;i++){
            sum += gain[i];
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
}

