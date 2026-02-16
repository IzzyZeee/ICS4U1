package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumber {

    // public static ArrayList<Integer> generate(int number, int max) {
    //     ArrayList<Integer> result = new ArrayList();

    //     for (int i = 0; i < number; i++) {

    //     }
    // }

    public static void main(String[] args) throws Exception {
        // Lets the user choose a positive integer, and gives a random number from zero
        // to that integer
        // Allows you to roll a chosen amount of times (at the same time)
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello fellow human! What number would you like to randomly generate from 1 to? (Positive integer, not 1):");
        System.out.println();

        int number = 0;

        try { // In case a non-integer value is entered (or other error)
            number = keyboard.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input, must be a positive integer that isn't 1.");
            System.exit(0);
        }

        if (number <= 1) { // Makes sure valid input
            System.out.println("Invalid input, must be a positive integer that isn't 1.");
            System.exit(0);
        }
    }
}