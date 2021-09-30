// 12. Perimeter Of Square
// 13. Perimeter Of Rhombus
// Both have all sides equal
package basic;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter side: ");
        float side = in.nextFloat();
        System.out.println("Perimeter: "+(4*side));
    }
}
