//4. Create your todays bazar list/pocket expenditure which includes the item name and price. Then create a function named searchItem(String item) which will be used to search any item from your HashMap and return the price. If found no item, then print message as "No item found" and another function named totalSum() which will return total price of items.

package function_array;
        import java.util.HashMap;
        import java.util.Scanner;

public class BazarListHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> bazarList = new HashMap<String, Integer>();
        bazarList.put("Ginger", 100);
        bazarList.put("Carrot", 80);
        bazarList.put("Onion", 35);
        bazarList.put("Potato", 30);

        int price = searchItem(bazarList);
        int totalPrice = totalSum(bazarList);

        System.out.println("Price = " + price);
        System.out.println("Total Price = " + totalPrice);
    }

    public static int searchItem(HashMap<String, Integer> bazar) {
        Scanner input = new Scanner(System.in);
        System.out.print("Search From Your List: ");
        String itemName = input.nextLine();
        int price = 0;
        if (bazar.containsKey(itemName)){
            price = bazar.get(itemName);
        }
        else {
            System.out.println("No item found");
        }
        return price;
    }

    public static int totalSum(HashMap<String, Integer> bazarList){
        int totalPrice = 0;
        for (String i : bazarList.keySet()) {
            totalPrice += bazarList.get(i);
        }
        return totalPrice;
    }

}

