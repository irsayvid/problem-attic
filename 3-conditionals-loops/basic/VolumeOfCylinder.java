//16. Volume Of Cylinder
package basic;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height of cylinder: ");
        float h = in.nextFloat();
        System.out.print("Enter radius of cylinder: ");
        float r = in.nextFloat();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume of cylinder: "+volume);
    }
}
