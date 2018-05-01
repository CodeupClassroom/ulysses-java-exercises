/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

public class ControlFlowExercises {
    public static void main(String[] args) {  // global scope
        int /* type declaration */ i; // variable declaration, followed by an assignment

        for (
            i = 5 /* initialization */;
            i <= 15 /* boolean expression -> the condition to stop */;
            i++/* increment*/
        ) {
            System.out.println(i);
//             i += 1;
//             i = i + 1;
        }

        for (
            i = 0; /* initialization */
            i <= 100 /* condition to continue*/;
            i += 2 /* increment */
        ) { // do while body
            System.out.println(i);
        }

    }
}
