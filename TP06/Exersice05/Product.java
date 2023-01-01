package Exersice05;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

import org.w3c.dom.ls.LSException;

import Exersice02.students;

public class Product {

    private int productNumber;
    private int productPrice;
    private String productName;
    // create an array list
    ArrayList<Product> list_product = new ArrayList<>();
    // LinkedList<Product> product = new LinkedList<Product>();

    Scanner sc = new Scanner(System.in);

    public Product() {
        list_product = new ArrayList<>();
    }

    public Product(int productNumber, String productName, int productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // method choice
    public void choice() {
        System.out.println("\n.........................................");
        System.out.println(": 1. List all product                    :");
        System.out.println(": 2. Add new product to list             :");
        System.out.println(": 3. Remove product from list by index   :");
        System.out.println(": 4. Update product in list              :");
        System.out.println(": 5. Quit                                :");
        System.out.println("..........................................");

    }

    // method read product into array list
    public void addProductIntoArrayList(int productNumber, String productName, int productPrice) {
        list_product.add(new Product(productNumber, productName, productPrice));
    }

    // method show list all product
    public void listAllProduct() {
        System.out.println("\nP No\tP name\t\tP price");
        for (Product product : list_product) {
            System.out.printf("%d\t%s\t\t%d\n", product.productNumber, product.productName, product.productPrice);
        }
    }

    // method add new product to list
    public void addProductToList() {
        int id = 0;
        // auto list id
        for (Product product : list_product) {
            id++;
        }
        System.out.printf("\nInput product name : ");
        String name = sc.next();
        System.out.printf("Input product price: ");
        int price = sc.nextInt();
        // add data
        list_product.add(new Product(id + 1, name, price));

    }

    // remove product from list by index
    public void removeProductByList() {
        int counter = 0;
        int indexArray = 0;
        System.out.println("\nP No\tP name\t\tP price");
        for (Product product : list_product) {
            System.out.printf("%d\t%s\t%d\n", product.productNumber, product.productName,
                    product.productPrice);
            indexArray++;
        }
        System.out.printf("remove product by id: ");
        int id = sc.nextInt();
        // condition of remove
        if (id > 0) {
            list_product.removeIf(Product -> Product.productNumber == id);
            counter++;
        }
        if (counter >= 1) {
            System.out.println("\nremoved !!!");
        } else {
            System.out.println("\nIt's can't remove !!!");
        }
    }

    // method update
    public void updateProduct() {
        int index = 0;
        Scanner sc = new Scanner(System.in);
        for (Product product : list_product) {
            System.out.printf("Update product by id: ");
            int id = sc.nextInt();
            if (id == product.productNumber) {
                System.out.printf("Input new product name : ");
                String newName = sc.next();
                System.out.printf("Input new product price: ");
                int newPrice = sc.nextInt();
                list_product.set(index, new Product(id, newName, newPrice));
            } else {
                index = index + 1;
            }
        }
    }
}