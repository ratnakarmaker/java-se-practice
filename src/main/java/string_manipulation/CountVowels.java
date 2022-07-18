//5. Write a program that will count how many vowels in the given string:
//        "roadtosdet"
//        Output: 4
package string_manipulation;

public class CountVowels {
    public static void main(String[] args) {
        String sen = "roadtosdet";
        int count = 0;
        for(int i = 0; i < sen.length(); i++){
            char ch = sen.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                count++;
            }
        }
        System.out.println("Total Vowel: " + count);
    }
}
