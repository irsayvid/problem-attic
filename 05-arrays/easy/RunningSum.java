package easy;//3. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)

import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers: ");
        int[] nums = new int[len];
        for (int i=0; i < len; i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Input Array: "+ Arrays.toString(nums));
        System.out.println("Built Array: "+ Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
