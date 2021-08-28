// 7. Area Of Equilateral Triangle
package basic;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of triangle: ");
        float a = in.nextFloat();
        double area = (Math.sqrt(3) * a * a)/4;
        System.out.println("Area of equilateral triangle: "+area);
    }
}
