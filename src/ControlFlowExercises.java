/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */

import java.util.Scanner;

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

        grades();
    }

    // Convert given number grades into letter grades.
    public static void grades() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String userChoice;
        short gradeNumber;
        int gradeTotal = 0;
        int numberOfGrades = 0;
        int average;

        do {
            // Prompt the user for a numerical grade from 0 to 100.
            System.out.print("Please input the student's grade between 0 and 100: ");
            gradeNumber = input.nextShort();

            String letterGrade = letterGrade(gradeNumber);

            System.out.println("The letter grade for " + gradeNumber + " is : " + letterGrade);

            numberOfGrades++;
            gradeTotal += gradeNumber;

            System.out.println("Do you want to calculate another grade?");
            userChoice = input.next();

        } while(userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes"));

        average = gradeTotal / numberOfGrades;
        System.out.println("The average grade for all assignments is: " + average);

        System.out.println("The average letter grade is: " + letterGrade(average));

    }

    public static String letterGrade(int gradeNumber) {
        String letterGrade;

        if(gradeNumber >= 90 && gradeNumber <= 100) {
            letterGrade = "A";
        } else if(gradeNumber >= 80) {
            letterGrade = "B";
        } else if(gradeNumber >= 70) {
            letterGrade = "C";
        } else if(gradeNumber >= 60) {
            letterGrade = "D";
        } else if(gradeNumber >=0 && gradeNumber <= 59){
            letterGrade = "F";
        } else {
            letterGrade = "This is not a valid grade. Please try again.";
        }

        return letterGrade;
    }
}


