// 10. Perimeter Of Parallelogram
package basic;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float perimeter = 0;
        int count = 1;
        while (count != 5)
        {
            System.out.print("Enter side " +count+ " of parallelogram: ");
            perimeter += in.nextFloat();
            count += 1;
        }
        System.out.println("Perimeter of Parallelogram: "+perimeter);
    }
}
