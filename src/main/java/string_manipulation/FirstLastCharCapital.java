//4. Writea program that will give following output:
//        Input: chattogram
//        Output: C8M

package string_manipulation;

public class FirstLastCharCapital {
    public static void main(String[] args) {
        String input = "chattogram";
        char firstLetter = input.toUpperCase().charAt(0);
        char lastLetter = input.toUpperCase().charAt(9);
        String letterNum = String.valueOf(input.length()-2);
        System.out.printf(firstLetter + letterNum + lastLetter);

    }
}
