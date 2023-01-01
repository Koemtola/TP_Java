package Exersice05;

import java.util.Scanner;

public class representsOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // use Product class
        Product product = new Product();
        product.addProductIntoArrayList(1, "Coca", 10);
        product.addProductIntoArrayList(2, "Beer", 10);
        product.addProductIntoArrayList(3, "Stringe", 10);
        while (1 > 0) {
            // Use method choise from Product class
            product.choice();
            // create are options
            System.out.printf("Choose a option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1: {
                    product.listAllProduct();
                    break;
                }
                case 2: {
                    product.addProductToList();
                    break;
                }
                case 3: {
                    product.removeProductByList();
                    break;
                }
                case 4: {
                    product.updateProduct();
                    break;
                }
                case 5: {
                    System.exit(5);
                    break;
                }
            }
        }
    }
}
