// 1. Area Of Circle Java Program
package basic;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        float r = in.nextFloat();
        double area = Math.PI * r * r;
        System.out.println("Area of circle: "+area);
        in.close();
    }
}
