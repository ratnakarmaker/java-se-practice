//2. Write a program to calculate GPA and find grade
package conditional_loop;

import java.util.Scanner;

public class CalculateGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total subject: ");
        int totalSubject = input.nextInt();

        int mark[] = new int[totalSubject];
        int i, totalNumber=0;

        for(i =0; i<totalSubject; i++) {
            System.out.printf("Enter the mark of Subject-" + (i+1) + ":");
            mark[i] = input.nextInt();
            totalNumber = totalNumber + mark[i];
        }
        float avg = (float)totalNumber/totalSubject;
        System.out.println("Your GPA is: "+ String.format("%.2f", avg));
        if(avg >= 80) {
            System.out.println("Your Grade is: A+");
        } else if(avg >= 70 && avg <=79) { 
            System.out.println("Your Grade is: A");
        }else if(avg >= 60 && avg <=69) {
            System.out.println("Your Grade is: B+");
        }
        else if(avg >= 50 && avg <=59) {
            System.out.println("Your Grade is: B");
        }
        else if(avg >= 40 && avg <=49) {
            System.out.println("Your Grade is: C");
        }
        else if(avg >= 35 && avg <=39) {
            System.out.println("Your Grade is: C");
        }
        else {
            System.out.println("Your Grade is: F");
        }
    }
}
