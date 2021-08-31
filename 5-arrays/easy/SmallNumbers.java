package easy;//8. [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/)

import java.util.Arrays;
import java.util.Scanner;

public class SmallNumbers {
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
        System.out.println("Good Identical Pairs: "+ Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int count;
        for (int i = 0; i < n; i++){
            count = 0;
            for (int j = 0; j < n; j++){
                if (nums[i] > nums[j]){
                    count += 1;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
