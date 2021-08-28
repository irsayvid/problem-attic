// 15. Volume Of Prism
package basic;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of prism: ");
        float l = in.nextFloat();
        System.out.print("Enter breadth of prism: ");
        float b = in.nextFloat();
        System.out.print("Enter height of prism: ");
        float h = in.nextFloat();
        float volume = l*b*h;
        System.out.println("Volume of prism: "+volume);
    }
}
