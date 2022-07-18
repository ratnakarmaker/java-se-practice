//1. Take input from a user and check if the number exists in the array
package function_array;

import java.util.Scanner;

public class CheckNumExitsInArray {
    public static void main(String[] args) {
        boolean flag = false;
        int arr[] = {1,3,5,7,2,4,6,8};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for(int i = 0; i < arr.length; i++) {
            if(number == arr[i]){
                System.out.println("Position= " + i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("No element found");
        }
    }
}
