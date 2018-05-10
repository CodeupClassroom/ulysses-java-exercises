import java.util.ArrayList;
import java.util.HashMap;

public class CollectionDemo {
    public static void main(String[] args) {
        HashMap<String, String> instructors = new HashMap<>();
        // username as the key and email as the value
        instructors.put("ryanorsinger", "ryan@codeup.com");
        instructors.put("zgulde", "zach@codeup.com");
        System.out.println(instructors);


        HashMap<String, Person> students = new HashMap<>();
        // key is username, value is the Person object

        students.put("wildmonkey", new Person("Gerald"));
        students.put("bananarama", new Person("Jane"));




    }


    protected void arrayListDemo() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Sandi");
        names.add("Ada");
        names.add("Linda");

        System.out.println(names);

        if(names.contains("Bob")) {
            System.out.println("Bob is here!");
        }


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(5);
        System.out.println(numbers);

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Batman"));
        people.add(new Person("Wonder Woman"));
        System.out.println(people);
    }
}
