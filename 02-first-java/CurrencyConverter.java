// 8. Input currency in rupee and output in dollar.
import java.util.Scanner;

public  class CurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter money in rupees: Rs ");
        float money = in.nextInt();
        System.out.println("Money in US Dollars: $ " + (0.013*money));
    }
}