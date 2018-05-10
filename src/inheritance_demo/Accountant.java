package inheritance_demo;

public class Accountant extends Employee {

    public Accountant(String name, String department) {
        super(name, department);
    }

    @Override
    public String work() {
        return "Looking for loopholes and deductions!";
    }
}
