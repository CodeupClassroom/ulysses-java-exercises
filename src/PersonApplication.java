/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import java.util.Scanner; // Fully Qualified Name

public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person(); // constructor

        System.out.println(person.lastName);
        System.out.println(person.name);

        person.lastName = "Mendoza";
        System.out.println(person.lastName);

        person.name = "Fer";
        System.out.println(person.name);

        Person person2 = new Person();
        person2.name = "Ryan";

//        Math.random()
//            Math.floor()

        System.out.println(person2.name);

        System.out.println(person.fullName());
        System.out.println(person2.fullName());

        Person person3 = new Person();

        System.out.println(Person.counter);
        java.util.Scanner scanner;
    }
}
