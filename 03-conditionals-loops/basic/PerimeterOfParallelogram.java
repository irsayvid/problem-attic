// 10. Perimeter Of Parallelogram
package basic;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.print("Enter opposie side1 of parallelogram: ");
            Double side1 = in.nextDouble();
            System.out.print("Enter opposie side2 of parallelogram: ");
            Double side2 = in.nextDouble();
            Double perimeter = 2*(side1+side2);
        System.out.println("Perimeter of Parallelogram: "+perimeter);
    }
}
