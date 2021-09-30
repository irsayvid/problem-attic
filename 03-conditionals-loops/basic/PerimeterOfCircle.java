// 8. Perimeter Of Circle
package basic;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter radius of the circle: ");
    float r = in.nextFloat();
    double perimeter = 2 * Math.PI * r;
    System.out.println("Perimeter of circle: "+perimeter);
}
}
