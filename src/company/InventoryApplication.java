package company;

import util.Input;

public class InventoryApplication {

    static Product[] products = new Product[5];
    static Input input = new Input();

    public static void main(String[] args) {
        System.out.println("Welcome to the store!");
        System.out.println("Add four new products: ");

        // add multiple products to the array
        products[0] = new Product("toothbrush", 3, .3);
        products[1] = new Car("Elvis", 1000000000, 1000, "ElvisMobile", "Sport");
        products[2] = new Shoe("Chucks", 30, 5, 8,"Hightop");
        products[3] = new Subscription("Economist", 5, 1, 12);
        products[4] = new Product("banana phone", 20, 5);

        System.out.println("What kind of product do you want to add to the inventory? ");
        System.out.println("Car, Shoe, Subscription, or Other");
        String userChoice = input.getString();

        Product userProduct;

        if(userChoice.equalsIgnoreCase("car")) {
                userProduct = new Car("Betty", 30000, 10000, "Buick", "Skylark");

        } else if(userChoice.equalsIgnoreCase("shoe")) {
                userProduct = new Shoe("Bootsy", 200, 50, 7, "Combat Boot");

        } else if(userChoice.equalsIgnoreCase("subscription")) {
                userProduct = new Subscription("Computer Buyer Monthly", 10, 2, 24);

        } else {
                userProduct = makeUserProduct();
        }

        products[5] = userProduct;

        // iterate through the array relying on polymorphism to call a method
    }

    protected static Product makeUserProduct() {
        System.out.println("Input the product name: ");
        String name = input.getString();

        System.out.println("Input the product's price?");
        double price = input.getDouble();

        System.out.println("What is the product's cost of production? ");
        double cost = input.getDouble();

        // prompt user for product data
        // instantiate a product object
        // return the product object
        return new Product(name, price, cost);
    }
}
