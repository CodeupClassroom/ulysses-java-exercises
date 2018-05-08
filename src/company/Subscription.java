package company;

public class Subscription extends Product {

    public int numberOfMonths;
    protected double revenuePerPeriod;

    public Subscription(String name, double price, double cost, int numberOfMonths) {
        // super(); calls the default constructor
        super(name, price, cost);
        this.numberOfMonths = numberOfMonths;
        getRevenuePerPeriod();
        type = "Subscription";
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
    }

    public double getRevenuePerPeriod(){
        return numberOfMonths * price;
    }


}
