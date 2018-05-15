/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input(); // instantiate an object / create an object

        double number = input.getDouble(3.5, 8.9);

        System.out.println(number);
    }
}
