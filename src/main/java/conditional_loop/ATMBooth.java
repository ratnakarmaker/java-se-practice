//4. Write a program to check balance and withdraw money from ATM booth using if else or switch case
package conditional_loop;

import java.util.Scanner;

public class ATMBooth {
    public static void main(String[] args) {
        int balance = 25000, withdraw;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Withdraw\n" +
                "2.Check Balance\n" + "3.Exit");
        System.out.print("Choose your option: ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter money what you want to withdraw:");
                withdraw = input.nextInt();
                if(withdraw <= balance) {
                   balance = balance-withdraw;
                    System.out.println("Please Collect Your Money.");
                }
                else {
                    System.out.println("Insufficient Balance");
                }
                break;
            case 2:
                System.out.println("Your Balance is: " + balance);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid Option!");
                System.exit(0);
        }
    }
}
