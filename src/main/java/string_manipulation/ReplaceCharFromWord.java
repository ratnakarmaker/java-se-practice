//6. Replace "R" from Rahim with "F" from the given String:
//        Input: Ratul and Rahim lives in Rangpur
//        Output: Ratul and Fahim lives in Rangpur

package string_manipulation;

public class ReplaceCharFromWord {
    public static void main(String[] args) {
        String input = "Ratul and Rahim lives in Rangpur";
        String sen = input.replace("Rah", "Fah");
        System.out.println("Old Sentance: " + input);
        System.out.println("New Sentance: " + sen);
    }
}
