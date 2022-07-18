//1.Write a program to check if inputted letter is small or capital
package conditional_loop;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner input = new Scanner(System.in);
        char letter = input.next().charAt(0);

        if(letter >= 97 && letter <= 127){
            System.out.println(letter + " is Lower case");
        }
        else if (letter >= 65 && letter <= 90){
            System.out.printf(letter + " is Upper case");
        }
        else {
            System.out.printf(letter + " is not Alphabet");
        }
    }
}
