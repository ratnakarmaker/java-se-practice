//9. Write a program to sum of user input until users input ‘q’ from keyboard
package conditional_loop;

import java.util.Scanner;

public class SumOfInputUntilQ {
    public static void main(String[] args) {
        int sum=0;
        char choice;
        System.out.println("Take a number: ");
        Scanner input = new Scanner(System.in);

        do{
            sum += input.nextInt();
            System.out.println("Sum= " + sum);
            System.out.println("Do you want to continue?y/q");
            choice = input.next().charAt(0);
        }
        while (choice!='q');
    }
}
