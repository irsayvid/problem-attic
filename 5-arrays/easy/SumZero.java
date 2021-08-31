package easy;

import java.util.Arrays;
import java.util.Scanner;

// 22. [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/)
public class SumZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Zero sum array: "+ Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int res[] = new int[n];
        for(int i = 0; i < n/2; i++){
            res[i] = i+1;
            res[n-i-1] = -1 * (i+1);
            res[n/2] = 0;
        }
        if (n % 2 == 0){
            res[n/2] = -1*n/2;
        }

        return res;
    }
}
