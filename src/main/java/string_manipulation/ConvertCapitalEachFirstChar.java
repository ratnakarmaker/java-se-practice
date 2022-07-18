//8. Write a program to convert each 1st char to uppercase from a string
//        Input: rahim lives in sylhet
//        Output: Rahim Lives in Sylhet

package string_manipulation;

public class ConvertCapitalEachFirstChar {
    public static void main(String[] args) {
        String input = "rahim lives in sylhet";
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++){
            String firstLetter= String.valueOf(words[i].charAt(0)).toUpperCase();
            String othersLetter=words[i].substring(1);
            System.out.printf(firstLetter+othersLetter + " ");
        }
    }
}
