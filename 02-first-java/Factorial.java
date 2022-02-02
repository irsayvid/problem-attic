// 1. Write a program to print factorial of a number, also take input.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
    static int factorial(int n)
    {
        int ans = 1;
        for(int i = 2; i <= n; i++)
        {
            ans *= i;
        }
        return ans;
    }

}
