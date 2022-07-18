//3. Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241
package conditional_loop;

import java.util.Scanner;

public class CheckDecimalsNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter floating point number: ");
        double first = input.nextDouble();
        System.out.print("Enter floating point another number: ");
        double second = input.nextDouble();

        first = Math.round(first * 100);
        first = first / 100;

        second = Math.round(second * 100);
        second = second / 100;

        if (first == second)
        {
            System.out.println("They are the same up to two decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
