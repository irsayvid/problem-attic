// 20. Total Surface Area Of Cube
package basic;

import java.util.Scanner;

public class TSAOfCube {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter side: ");
        float side = in.nextFloat();
        System.out.println("Total Surface Area Of Cube: "+(6*side*side));
    }
}
