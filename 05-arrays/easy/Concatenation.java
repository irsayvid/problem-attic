package easy;// 2. [easy.Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)
import java.util.Arrays;
import java.util.Scanner;

public class Concatenation {
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
        System.out.println("Built Array: "+ Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = 2 * nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++){
            res[i] = nums[i%(n/2)];
        }
        return res;
    }
}
