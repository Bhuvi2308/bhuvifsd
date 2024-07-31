package thirdtask;

import java.util.Scanner;

public class Xyz {

	// Method to find product ID with the highest price
    public static String findProductIdWithHighestPrice(Product[] products) {
        if (products == null || products.length == 0) {
            return null;
        }

        Product maxPriceProduct = products[0];
        for (Product product : products) {
            if (product.getProductPrice() > maxPriceProduct.getProductPrice()) {
                maxPriceProduct = product;
            }
        }
        return maxPriceProduct.getProductId();
    }

    // Method to calculate total amount spent on all products
    public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0.0;
        for (Product product : products) {
            totalAmount += product.getProductPrice() * product.getProductQuantity();
        }
        return totalAmount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Input product information from user
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            String productId = scanner.nextLine();
            System.out.print("Product Price: ");
            double productPrice = scanner.nextDouble();
            System.out.print("Product Quantity: ");
            int productQuantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            products[i] = new Product(productId, productPrice, productQuantity);
        }

        // Find and display the product ID with the highest price
        String highestPriceProductId = findProductIdWithHighestPrice(products);
        System.out.println("Product ID with the highest price: " + highestPriceProductId);

        // Calculate and display the total amount spent
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: $" + totalAmountSpent);

        scanner.close();
    }
}
