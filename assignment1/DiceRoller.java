package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceRoller {

    public static ArrayList<Integer> roll(int number) {
        int countOne = 0;
        int countTwo = 0;
        int countThr = 0;
        int countFou = 0;
        int countFiv = 0;
        int countSix = 0;
        ArrayList<Integer> result = new ArrayList();

        int sum = 0;

        for (int i = 0; i < number; i++) {
            int finalResult = 0; // This is the random 1-6 number that'll be returned
            int firstResult = (int) (Math.random() + 0.5);

            if (firstResult == 1) { // Odd

                int secondResult = (int) (Math.random() + (1.0 / 3));

                if (secondResult == 1) { // This has a 1/3 chance, multiplied with 1/2 gives 1/6. This will be "1"
                    finalResult = 1;
                    countOne++;
                } else {

                    int thirdResult = (int) (Math.random() + 0.5);

                    if (thirdResult == 1) {
                        finalResult = 3;
                        countThr++;
                    } else {
                        finalResult = 5;
                        countFiv++;
                    }

                }

            } else { // Even

                int secondResult = (int) (Math.random() + (1.0 / 3));

                if (secondResult == 1) { // This has a 1/3 chance, multiplied with 1/2 gives 1/6. This will be "2"
                    finalResult = 2;
                    countTwo++;
                } else {

                    int thirdResult = (int) (Math.random() + 0.5);

                    if (thirdResult == 1) {
                        finalResult = 4;
                        countFou++;
                    } else {
                        finalResult = 6;
                        countSix++;
                    }

                }
            }

            result.add(finalResult);
            sum += finalResult;
        }

        result.add(sum); // So we can give back the sum/number counts- this'll be unpacked manually later (bad strategy though, needs optimization)
        result.add(countOne);
        result.add(countTwo);
        result.add(countThr);
        result.add(countFou);
        result.add(countFiv);
        result.add(countSix);
        return result;
    }

    public static void main(String[] args) throws Exception {
        // Rolls a 6-sided die, and returns a random number from 1-6
        // You can choose how many dice you want to roll
        // Will return the sum of all the dice you roll
        // Will also tell you how many of each number you got
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello fellow human! How many dice do you want to roll? (Positive integer):");
        System.out.println();

        int number = 0;

        try { // In case a non-integer value is entered (or other error)
            number = keyboard.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input, must be a positive integer.");
            System.exit(0);
        }

        if (number <= 0) { // Makes sure valid input
            System.out.println("Invalid input, must be a positive integer.");
            System.exit(0);
        }

        ArrayList<Integer> result = roll(number);
        
        System.out.println("Your results are:");
        System.out.println();

        for (int i = 0; i < (result.size() - 7); i++) { // Last 7 indexes are sum, then counts 1-6 respectively
            System.out.println((i + 1) + ". " + result.get(i)); // Print roll result, numbered
        }

        System.out.println();
        System.out.println("Roll results:");
        System.out.println("Sum: " + result.get(result.size() - 7));
        System.out.println("Ones: " + result.get(result.size() - 6));
        System.out.println("Twos: " + result.get(result.size() - 5));
        System.out.println("Threes: " + result.get(result.size() - 4));
        System.out.println("Fours: " + result.get(result.size() - 3));
        System.out.println("Fives: " + result.get(result.size() - 2));
        System.out.println("Sixes: " + result.get(result.size() - 1));
        keyboard.close();
    }
}