//10. Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.
package conditional_loop;

import java.util.Scanner;

public class FindLargeAndSmall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        char choice;

        do
        {
            System.out.print("Enter the number: ");
            int number = input.nextInt();

            if(number > large)
            {
                large = number;
            }
            if(number < small)
            {
                small = number;
            }

            System.out.print("Do you want to continue?y/n ");
            choice = input.next().charAt(0);

        }while(choice=='y' || choice == 'Y');

        System.out.println("Largest number: " + large);
        System.out.println("Smallest number: " + small);
    }
}
