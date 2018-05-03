/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class Person {
    public String name;
    public String lastName;
    public static int counter = 0; // instance variables

    public Person() {
        counter++;
    }

    // Instance method
    public String fullName() {
        return String.format("%s %s", name, lastName);
    }

    public String yellName(){
        return name.toUpperCase();
    }
}
