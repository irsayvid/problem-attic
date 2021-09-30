//22. [Subtract the Product and Sum of Digits of an Integer](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
package basic;

import java.util.Scanner;

public class DiffOfSDnPD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int sod = 0, pod = 1, temp;
        while (n > 0){
            temp = n%10;
            sod += temp;
            pod *= temp;
            n /= 10;
        }
        System.out.println("Difference: "+(pod-sod));
    }
}
