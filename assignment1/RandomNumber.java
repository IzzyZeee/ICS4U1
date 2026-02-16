package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class RandomNumber {

    public static ArrayList<Integer> generate(int numberOfRolls, int maxNumber) {
        ArrayList<Integer> result = new ArrayList();

        for (int i = 0; i < numberOfRolls; i++) {
            double random = Math.random();

            if (random == 1) { // Extremely rare case. It technically messes with the probability, but is negligible
                result.add(maxNumber); 
                continue;
            }

            for (int j = 1; j <= maxNumber; j++) {

                if (random < ((1.0 / maxNumber) * (j))) { // Basically, checking each n/maxNumber for n is a whole number less than maxNumber
                    result.add(j);                
                    break;
                }

            }

        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        // Lets the user choose a positive integer, and gives a random number from zero to that integer
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

        System.out.println("How, how many times do you want to generate the random number?");
        System.out.println();

        int numGenerations = 0;

        try { // In case a non-integer value is entered (or other error)
            numGenerations = keyboard.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input, must be a positive integer that isn't 1.");
            System.exit(0);
        }

        if (numGenerations < 1) { // Makes sure valid input
            System.out.println("Invalid input, must be a positive integer.");
            System.exit(0);
        }

        ArrayList<Integer> result = generate(numGenerations, number);

        System.out.println("Your results are:");
        System.out.println();

        for (int i = 0; i < result.size(); i++) { // Returns results in a numbered list
            System.out.println((i + 1) + ". " + result.get(i));
        }
        
        keyboard.close();
    }
}