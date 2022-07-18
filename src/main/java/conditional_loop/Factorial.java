//6. Write  a program to find the factorial of a given number
package conditional_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int factorial = 1, i;
        Scanner input = new Scanner(System.in);
        System.out.print("Take a number: ");
        int number = input.nextInt();
        for(i =1; i<= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + number + " is= " + factorial);
    }
}
