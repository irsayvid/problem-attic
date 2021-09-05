package Medium;
//5. [Jump Game](https://leetcode.com/problems/jump-game/)

import java.util.Arrays;
import java.util.Scanner;

public class JumpGame {
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
        System.out.println("Can reach the end?: "+ canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int maxMoves = nums[0];
        for (int i=0; i<= maxMoves; i++) {
            if (maxMoves >= nums.length-1) return true;
            if (maxMoves < i+nums[i]){
                maxMoves = i+nums[i];
            }
        }
        return false;
    }
}
