//5. Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()
package function_array;

import java.util.Scanner;

public class FindAvgEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] mark = new int[5];
        int i;

        for(i =0; i<5; i++) {
            System.out.print("Enter the Number"+ ":");
            mark[i] = input.nextInt();
        }
        int avg = average(mark);
        int evenCount = countEvenNumbers(mark);
        int oddCount = countOddNumbers(mark);

        System.out.println("Average = "+ avg);
        System.out.println("Even = " + evenCount);
        System.out.println("Odd = " + oddCount);
    };
    public static  int average(int[] mark){
        float avg;
        float totalNumber=0;
        for(int i =0; i<5; i++) {
            totalNumber = totalNumber + mark[i];
        }
        avg = totalNumber/5;
        return (int) avg;
    };
    public static  int countEvenNumbers(int[] mark){
        int evenCount = 0;

        for(int i =0; i<5; i++){
            if(mark[i]%2 == 0){
                evenCount ++;
            }
        }
        return evenCount;
    };

    public static int countOddNumbers(int[] mark){
        int oddCount = 0;

        for(int i =0; i<5; i++){
            if(mark[i]%2 != 0){
                oddCount ++;
            }
        }
        return oddCount;
    }

}

