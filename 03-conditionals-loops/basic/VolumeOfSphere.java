// 17. Volume Of Sphere
package basic;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the sphere: ");
        float r = in.nextFloat();
        double volume = 4*Math.PI*Math.pow(r,3)/3;
        System.out.println("Volume of Sphere: "+volume);
    }
}
