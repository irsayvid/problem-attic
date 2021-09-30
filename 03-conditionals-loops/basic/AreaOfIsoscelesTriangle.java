// 4. Area Of Isosceles Triangle
package basic;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter equal side of triangle: ");
        float b = in.nextFloat();
        System.out.print("Enter final side of triangle: ");
        float a = in.nextFloat();
        double area = a * Math.sqrt((b*b)-((a*a)/4)) / 2;
        System.out.println("Area of isosceles triangle: "+area);
    }
}
