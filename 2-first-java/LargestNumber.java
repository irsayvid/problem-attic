// 6. Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float num1 = in.nextFloat();
        System.out.println("Enter another number: ");
        float num2 = in.nextFloat();
        if (num1 == num2)
        {
            System.out.println("Both are equal.");
        }
        else if(num1 > num2)
        {
            System.out.println(num1 + " is greater");
        }
        else
        {
            System.out.println(num2 + " is greater");
        }
    }
}