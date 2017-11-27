/*
 *author Ahmad Wahedi
 * CSC 201-004N
 * Assignment 12
 * Problem 12.2
 *
 (InputMismatchException)
 Write a program that prompts the user to read
 two integers and displays their sum. Your program should prompt the user to
 read the number again if the input is incorrect
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class homework12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 integers: ");
        int number1 = 0;
        int number2 = 0;
        boolean tisRight = false;
        while (!tisRight) {
            try {
                number1 = input.nextInt();
                number2 = input.nextInt();
                tisRight = true;
            } catch (InputMismatchException ex) {

                input.nextLine();
                System.out.println("Error input..." );
                System.out.print("Enter two integers: ");
            }
        }
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
    }
}