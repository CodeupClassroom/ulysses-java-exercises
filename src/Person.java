/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

// Create Person class inside of src
public class Person {
    // private name property that is a string
    // property /  field / attribute / instance variable
    private String name;

    // The class should have a constructor that accepts a string value and sets the person's name to the passed string.
    public Person(String name) { // A new person cannot have an empty name
        setName(name);  // self-encapsulation
    }

    // method's signature
    // getter -> prefix get
    public String /* return type*/ getName /* method name */( /* number of parameters, names/types*/) {
        return name;
    }

    // A name cannot be empty
    public void setName(String name) {
        if (name.isEmpty()) System.out.println("That is invalid!");
        else this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello %s!%n", name);
    }

    // Create a main method
    public static void main(String[] args) {
        // creates a new Person object and tests the above methods.
        Person person = new Person("Ryan");
        System.out.println(person.getName());
        person.setName("Ryan 2.0");
        person.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);  // are this 2 things pointing to the same values
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
        person2.setName("Jane");
        person1.sayHello();
        person2.sayHello();
    }
}
