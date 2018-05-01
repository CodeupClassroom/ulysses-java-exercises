/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class FizzBuzz {
    public static void main(String[] args) {
        String fizzBuzz;
        for (int i = 1; i < 100; i++) {
            fizzBuzz = "";
            if (i % 3 == 0) {
                fizzBuzz = "fizz";
            }
            if (i % 5 == 0) {
                fizzBuzz += "buzz";
            }
            if (fizzBuzz.isEmpty()) {
                fizzBuzz = String.valueOf(i);
            }
            System.out.println(fizzBuzz);
        }
    }
}
