// 14. Volume Of Cone Java Program
package basic;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height of cone: ");
        float h = in.nextFloat();
        System.out.print("Enter radius of cone: ");
        float r = in.nextFloat();
        double volume = (Math.PI * r * r * h) / 3;
        System.out.println("Volume of cone: "+volume);
    }

}
