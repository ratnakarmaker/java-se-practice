//7. Write a program to print prime numbers from 2 to n
package conditional_loop;

import java.util.Scanner;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int i=0, num=0;
        String primeNumbers = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (i=2; i<= number; i++) {
            int counter=0;
            for(num=i; num>=1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2){
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime Numbers between 2 to " + number + " is: " + primeNumbers);
    }
}
