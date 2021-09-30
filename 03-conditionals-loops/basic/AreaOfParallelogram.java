// 5. Area Of Parallelogram
package basic;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side 1 of parallelogram: ");
        float a = in.nextFloat();
        System.out.print("Enter side 2 of parallelogram: ");
        float b = in.nextFloat();
        System.out.print("Enter acute angle between the sides in degrees: ");
        double angle = Math.toRadians(in.nextFloat());
        double area = a * b * Math.sin(angle);
        System.out.println("Area of Parallelogram: "+area);
    }
}
