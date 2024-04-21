package AssociativeArrays.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Double> shopPrice = new LinkedHashMap<>();
        Map<String, Integer> shopQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")) {

            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int count = Integer.parseInt(input.split(" ")[2]);

            if (!shopQuantity.containsKey(product)) {
                shopQuantity.put(product, count);
            } else {
                shopQuantity.put(product, shopQuantity.get(product) + count);
            }

            shopPrice.put(product, price);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : shopQuantity.entrySet()) {

            String productName = entry.getKey();
            double finalSum = shopQuantity.get(productName) * shopPrice.get(productName);

            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
