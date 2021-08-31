package easy;

import java.util.Arrays;
import java.util.Scanner;

//21. [Two Sum](https://leetcode.com/problems/two-sum/)
public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers: ");
        int[] nums = new int[len];
        for (int i=0; i < len; i++){
            nums[i] = in.nextInt();
        }
        System.out.print("Enter target number: ");
        int target = in.nextInt();
        System.out.println("Input Array: "+ Arrays.toString(nums));
        System.out.println("Indices: "+ Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++){
            for (int j = i + 1; j < len; j++)
            {
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
