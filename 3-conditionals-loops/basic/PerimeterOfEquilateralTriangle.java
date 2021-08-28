// 9. Perimeter Of Equilateral Triangle
package basic;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of triangle: ");
        double a = in.nextFloat();
        double perimeter = 3 * a;
        System.out.println("Perimeter of equilateral triangle: "+perimeter);
    }
}
