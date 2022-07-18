//2. Input an amount from the user and find out the number of notes from input amount in given array
//        [1000,500,100,50,20,10,5,2,1]

package function_array;

import java.util.Scanner;

public class FindNotesNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Amount: ");
        int amount = input.nextInt();
        int[] notes= {1000,500,100,50,20,10,5,2,1};

        for(int i = 0; i < notes.length; i++) {
            if(amount >= notes[i]) {
                int noteNumber = amount/notes[i];
                int restAmount = amount%notes[i];
                amount = restAmount;
                System.out.println(notes[i] + " Taka Note = " + noteNumber);
            }
        }
    }
}
