/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

// Create Person class inside of src
public class Person {
    // private name property that is a string
    // property /  field / attribute / instance variable
    private String name;

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
}
