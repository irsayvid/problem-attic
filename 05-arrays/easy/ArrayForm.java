package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//18. [Add to Array-Form of Integer](https://leetcode.com/problems/add-to-array-form-of-integer/)
public class ArrayForm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = in.nextInt();
        System.out.print("Enter numbers: ");
        int[] digits = new int[len];
        for (int i=0; i < len; i++){
            digits[i] = in.nextInt();
        }
        System.out.print("Enter number to be added: ");
        int num = in.nextInt();
        System.out.println("Input Array: "+ Arrays.toString(digits));
        System.out.println("Built Array: "+ addToArrayForm(digits, num));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = num.length-1; i >= 0; i--){
            k += num[i];
            res.add(0, k%10);
            k /= 10;
        }
        while (k > 0){
            res.add(0,k%10);
            k /= 10;
        }

        return res;
    }
}

