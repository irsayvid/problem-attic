package Medium;
//3. [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)

import java.util.Arrays;
import java.util.Scanner;

public class ProductArray {
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
        System.out.println("Product Array: "+ Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int left = 1, right = 1;
        for (int i = 0; i < len; i++){
            res[i] = 1;
        }
        for (int i = 0; i < len; i++){
            res[i] *= left;
            left *= nums[i];
            res[len-i-1] *= right;
            right *= nums[len-i-1];
        }
        return res;
    }
}
