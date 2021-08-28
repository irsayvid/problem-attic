// 11. Perimeter Of Rectangle
package basic;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        float l = in.nextFloat();
        System.out.print("Enter breadth of rectangle: ");
        float b = in.nextFloat();
        System.out.println("Perimeter of Rectangle: "+(2*(l+b)));
    }
}
