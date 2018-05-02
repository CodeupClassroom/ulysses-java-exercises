/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class Power {
    public static void main(String[] args) {

        // 2 ^ 6
        // 2 * 2^5
        // 2 * 2^4
        // 2 * 2^3
        // 2 * 2^2
        // 2 * 2^1

        // anything ^ 1 = Anything
        // anything ^ 0 = 1
        System.out.println(powerRecursive(2, 4));

    }

    public static int powerRecursive(int number, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return number;
        }
        return number * powerRecursive(number, exponent - 1);
    }


    public static int power(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
}
