// 3. Area Of Rectangle Program
package basic;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        float l = in.nextFloat();
        System.out.print("Enter breadth of rectangle: ");
        float b = in.nextFloat();
        System.out.println("Area of Rectangle: "+(l*b));
    }
}
