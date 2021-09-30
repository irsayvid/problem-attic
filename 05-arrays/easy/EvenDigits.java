package easy;

import java.util.Arrays;
import java.util.Scanner;

// 16. [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
public class EvenDigits {
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
        System.out.println("Numbers having even digits count: "+ findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++){
            if(isEven(nums[i])){
                res += 1;
            }
        }
        return res;
    }
    public static boolean isEven(int n){
        int total_digits = 0;
        while(n > 0){
            total_digits += 1;
            n = n/10;
        }
        return total_digits % 2 == 0;
    }
}
