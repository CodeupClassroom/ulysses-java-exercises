/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class Fibonacci {
    public static void main(String[] args) {
        // 1  = fib(1)
        // 1  = fib(2)

        // 1 + 1 = 2 = fib(3)
        // fib(1) + fib(2) = fib(3)

        // 1 + 2 = 3 = fib(4)
        // fib(2) + fib(3) = fib(4)

        // 2 + 3 = 5 = fib(5)
        // fib(3) + fib(4) = fib(5)

        // 3 + 5 = 8 = fib(6)
        // fib(4) + fib(5) = fib(6)

        // 5 + 8 = 13 = fib(7)
        // fib(5) + fib(6) = fib(7)

        // 8 + 13 = 21 = fib(8)
        // fib(6) + fib(7) = fib(8)
        System.out.println(fib(9));
    }

    public static long fib(int number) {
        if (number < 1) {
            // This would be better with an exception, which will learn later...
            System.out.println("Enter a number greater than or equals to 1");
            return -1;
        }
        if (number == 1) {
            return 1;
        }
        if (number == 2) {
            return 1;
        }
        return fib(number - 2) + fib(number - 1);
    }
}
