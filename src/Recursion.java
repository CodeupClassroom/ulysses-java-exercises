/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class Recursion {
    public static void main(String[] args) {
//        System.out.println(multiply(3, -6));

        System.out.println(multiplyRecursive(56, 0));
        System.out.println(multiplyRecursive(9872943, 1));
        System.out.println(multiplyRecursive(3, 5));

        // recursion definition
        // base case(s) -> stop condition -> boolean expression

        // anything * 1 -> anything
        // anything * 0 -> 0

        // recursive call -> different arguments
        //5 * 5
        // 25
        // 5 +  20
        //  5 +  15
        //      5 +  10
        //          5 +  5
        //                  5
    }

    public static int multiplyRecursive(int multiplicand, int multiplier) {
        if (multiplier == 0) {
            return 0;
        }
        if (multiplier == 1) {
            return multiplicand;
        }
        return multiplicand + multiplyRecursive(multiplicand, multiplier - 1);
    }

    // multiplier needs to be 0 or greater
    public static int multiply(int multiplicand, int multiplier) {
        int product = 0;
        for (int i = 0; i < multiplier; i++) {
            product += multiplicand;
        }
        return product;
    }
}
