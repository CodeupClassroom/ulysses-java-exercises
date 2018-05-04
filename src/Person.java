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

    }
}
