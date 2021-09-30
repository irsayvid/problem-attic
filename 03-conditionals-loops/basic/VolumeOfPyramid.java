// 18. Volume Of Pyramid
package basic;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of pyramid: ");
        float l = in.nextFloat();
        System.out.print("Enter breadth of pyramid: ");
        float b = in.nextFloat();
        System.out.print("Enter height of pyramid: ");
        float h = in.nextFloat();
        float volume = (l*b*h)/3;
        System.out.println("Volume of pyramid: "+volume);
    }
}
