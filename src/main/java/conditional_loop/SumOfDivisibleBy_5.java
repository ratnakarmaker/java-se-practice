//5. Write a program to sum of numbers which only divisible by 5 from 1 to 100
package conditional_loop;

public class SumOfDivisibleBy_5 {
    public static void main(String[] args) {
        int sum = 0, i;
        for(i=1; i<= 100; i++) {
            if(i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum= " + sum);
    }
}
