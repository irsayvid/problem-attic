package easy;// 1. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)

import java.util.Arrays;
import java.util.Scanner;

public class BuildArray {
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
        System.out.println("Built Array: "+ Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++){
            res[i] = nums[nums[i]];
        }
        return res;
    }
}
