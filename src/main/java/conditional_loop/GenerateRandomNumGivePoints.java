//8. Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.
package conditional_loop;

import java.util.Scanner;

public class GenerateRandomNumGivePoints {
    public static void main(String[] args) {
        int point = 0;
        Scanner input = new Scanner(System.in);

    for(int i = 1; i<= 10; i++) {
        int a = (int)(Math.random()*(20-10+1)+10);
        int b = (int)(Math.random()*(20-10+1)+10);
//        System.out.println(a + "," + b);

        System.out.println("Enter a number between 10 to 20: ");
        int number = input.nextInt();
        if(a == number || b == number) {
            point ++;
        }
        System.out.println("Point= " + point);
    }
    }
}
