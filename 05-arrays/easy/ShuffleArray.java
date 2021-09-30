package easy;// 5. [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/)
import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
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
        System.out.println("Shuffled Array: "+ Arrays.toString(shuffle(nums, len/2)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int count = 0, i = 0;
        while(count != n){
                res[i] = nums[count];
                res[i+1] = nums[count+n];
                count += 1;
                i += 2;
        }
        return res;
    }
}
