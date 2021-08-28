// 19. Curved Surface Area Of Cylinder
package basic;

import java.util.Scanner;

public class CSAOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height of cylinder: ");
        float h = in.nextFloat();
        System.out.print("Enter radius of cylinder: ");
        float r = in.nextFloat();
        double csa = 2 * Math.PI * r * h;
        System.out.println("Curved Surface Area of cylinder: "+csa);
    }
}
