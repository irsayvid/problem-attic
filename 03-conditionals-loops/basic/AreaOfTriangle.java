// 2. Area Of Triangle
package basic;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side a of triangle: ");
        float a = in.nextFloat();
        System.out.print("Enter side b of triangle: ");
        float b = in.nextFloat();
        System.out.print("Enter side c of triangle: ");
        float c = in.nextFloat();
        double area, s = (a + b + c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle: " +area);
    }
}
