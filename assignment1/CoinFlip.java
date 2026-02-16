package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class CoinFlip {

    public static ArrayList<Integer> flip(int number) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            result.add((int) (Math.random() + 0.5)); // Math.random gives you a decimal from 0-1, which when you add 1, has a 50% chance of truncating to 0 or 1
        }

        return result;

    }

    public static void main(String[] args) throws Exception {
        // Simple coin flip simulation - will flip a coin(s) that will land either Heads or Tails.
        // You can choose how many coins to flip at once, and the results will be NUMBERED AND PRINTED

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello fellow human! How many coins do you want to flip? (Positive integer):");
        System.out.println();

        int number = 0;

        try { // In case a non-integer value is entered (or other error)
            number = keyboard.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input, must be a positive integer.");
            System.exit(0);
        }

        if (number <= 0) { // Makes sure valid integer input
            System.out.println("Invalid input, must be a positive integer.");
            System.exit(0);
        }

        ArrayList<Integer> result = flip(number);

        System.out.println("Your results are:");
        System.out.println();

        int headsCount = 0;
        int tailsCount = 0;

        for (int i = 0; i < result.size(); i++) { // Returns results in a numbered list

            if (result.get(i) == 0) { // 0 in array corresponds to Heads
                headsCount++;
                System.out.println((i + 1) + ". Heads");
                continue;
            }
            // Reaches this if NOT Heads
            tailsCount++;
            System.out.println((i + 1) + ". Tails");
        }

        System.out.println();
        System.out.println("You had " + headsCount + " Heads and " + tailsCount + " Tails.");
        keyboard.close();

    }
}