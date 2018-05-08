package company;

public class Product {
    protected double price;
    protected String name;
    protected double cost;
    protected String type;

    public Product(){} // default constructor

    public Product(String name, double price, double cost) {
        this.price = price;
        this.name = name;
        this.cost = cost;
    }

    public Product(String name, double price, double cost, String type) {
        this.price = price;
        this.name = name;
        this.cost = cost;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void getType() {
        System.out.println("Product is a " + type);
    }
}
