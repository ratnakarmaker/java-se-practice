//Output: TXN123456

package string_manipulation;

public class ExtractIDFromHTML {
    public static void main(String[] args) {
        String input = "<html>\n" +
                "<title>Test</title>\n" +
                "<body>\n" +
                "Your trnx is successful. Trnx Id is: TXN123456\n" +
                "</body>\n" +
                "</html>";
        int trnxStartIndex = input.indexOf("TXN");
        int trnxEndtIndex = trnxStartIndex+9;
        String trnxId = input.substring(trnxStartIndex, trnxEndtIndex);
        System.out.println(trnxId);
    }
}
