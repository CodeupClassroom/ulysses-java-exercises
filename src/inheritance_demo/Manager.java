package inheritance_demo;

public class Manager extends Employee implements Meetable {

    public Manager(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "Communicating expectations, goals, and constraints to the team!";
    }

    public void goToMeeting() {
        System.out.println("ZOMG, I love meetings. I would die without meetings.");
    }
}
