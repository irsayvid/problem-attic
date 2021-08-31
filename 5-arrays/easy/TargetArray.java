package easy;// 9. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers in nums array: ");
        int[] nums = new int[len];
        for (int i=0; i < len; i++){
            nums[i] = in.nextInt();
        }
        System.out.print("Enter numbers in index array: ");
        int[] index = new int[len];
        for (int i=0; i < len; i++){
            index[i] = in.nextInt();
        }
        System.out.println("Input Array: "+ Arrays.toString(nums));
        System.out.println("Built Array: "+ Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < n; i++){
            target[i] = list.get(i);
        }
        return target;
    }
}
