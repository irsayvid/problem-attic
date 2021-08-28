// 6. Area Of Rhombus
package basic;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of rhombus: ");
        float a = in.nextFloat();
        System.out.print("Enter diagonal of rhombus: ");
        float p = in.nextFloat();
        double area = p * (Math.sqrt((4*a*a)-(p*p)))/2;
        System.out.println("Area of Rhombus: "+area);
    }
}
