// 21. Fibonacci Series In Java Programs
package basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int a = 0, b = 1, temp;
        System.out.print("0 ");
        for (int i = 1; i < n ; i++)
        {
            temp = b;
            b += a;
            a = temp;
            System.out.print(b+" ");
        }
    }
}
