//2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?
package string_manipulation;

public class ClothDiscountPrice {
    public static void main(String[] args) {
       String input = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted. After your purchase what will be your total cost?";
        String numbers = input.replaceAll("[^\\d]", " ").trim();
        String[] prices = numbers.replaceAll(" +", " ").split(" ");
        int shirtPrice = Integer.parseInt(prices[0]);
        int shareePrice = Integer.parseInt(prices[1]);
        int shirtCount = Integer.parseInt(prices[2]);
        int shareeCount = Integer.parseInt(prices[3]);
        int discountPrice = Integer.parseInt(prices[4]);

        if(shirtCount == 2 && shareeCount ==1) {
            int totalCost = (shirtPrice * shirtCount) + (shareePrice * shareeCount) - discountPrice;
            System.out.println("Total Cost: " + totalCost);
        }
        else {
            int totalCost = (shirtPrice * shirtCount) + (shareePrice * shareeCount);
            System.out.println("Total Cost: " + totalCost);
        }
    }
}
