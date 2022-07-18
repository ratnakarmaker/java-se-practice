//3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

package string_manipulation;

public class LaptopDiscountPrice {
    public static void main(String[] args) {
        String input = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?";
        String numbers = input.replaceAll("[^\\d]", " ").trim();
        String[] prices = numbers.replaceAll(" +", " ").split(" ");
        int laptopPrice = Integer.parseInt(prices[1]);
        int discount = Integer.parseInt(prices[2]);
        int discountAmount = (discount*laptopPrice)/100;
        int purchasePrice = laptopPrice-discountAmount;
        System.out.println(purchasePrice);
    }
}
