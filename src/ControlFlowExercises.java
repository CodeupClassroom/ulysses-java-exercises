/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class ControlFlowExercises {
    public static void main(String[] args) {  // global scope
        int /* type declaration */ i = 5; // variable declaration, followed by an assignment

        while (
            i <= 15 /* boolean expression -> the condition to stop */
        ) {
            System.out.println(i);
            i++;
//             i += 1;
//             i = i + 1;
        }

        i = 0;
        do { // do while body
            System.out.println(i);
            i += 2;
        } while (i <= 100 /* condition to continue*/);

    }
}
