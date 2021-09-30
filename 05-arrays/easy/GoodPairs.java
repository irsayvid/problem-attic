package easy;//7. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)

import java.util.Arrays;
import java.util.Scanner;

public class GoodPairs {
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
        System.out.println("Good Identical Pairs: "+ numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n-1; i++){
            for (int j = i+1; j < n; j++){
                if (nums[i] == nums[j]){
                    count += 1;
                }
            }
        }
        return count;
    }
}
