package inheritance_demo;

public class Developer extends Employee implements WritesCode, Meetable {

    public Developer(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "Think, think, think, code, code, code";
    }

    public boolean debug() {
        int randomNumber = (int) Math.floor(Math.random() * 2);
        return randomNumber == 0 ? false : true;
    }

    public void drinkCoffee() {
        System.out.println("zomg, I love coffee!");
    }


    public void searchForAnswer() {
        System.out.println("Searching StackOverflow and the documentation for answers.");
    }

    public void goToMeeting() {
        System.out.println("Crap, I forgot the meeting!");
    }
}
