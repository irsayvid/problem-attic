//5. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float a = in.nextFloat();
        System.out.print("Enter another number: ");
        float b = in.nextFloat();
        System.out.print("Enter operation: ");
        char op = in.next().charAt(0);
        if (op == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (op == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (op == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (op == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }
//        switch (op){
//            case '+':
//                System.out.println(a+" + "+b+" = "+(a+b));
//                break;
//            case '-':
//                System.out.println(a+" - "+b+" = "+(a-b));
//                break;
//            case '*':
//                System.out.println(a+" * "+b+" = "+(a*b));
//                break;
//            case '/':
//                System.out.println(a+" / "+b+" = "+(a/b));
//                break;
//            default:
//                System.out.println("Invalid operator");
    }
}

