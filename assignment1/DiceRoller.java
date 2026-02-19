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
            double random = Math.random();

            if (random == 1) { // Extremely rare case. It technically messes with the probability, but is negligible
                result.add(6);
                sum += 6;
                countSix++; 
                continue;
            }

            for (int j = 1; j <= 6; j++) {

                if (random < ((1.0 / 6) * (j))) { // Basically, checking each n/maxNumber for n is a whole number less than maxNumber
                    result.add(j);
                    sum += j;
                    
                    switch (j) { // Add to their respective counts
                        case 1:
                            countOne++;
                            break;
                        case 2:
                            countTwo++;
                            break;
                        case 3:
                            countThr++;   
                            break;
                        case 4:
                            countFou++;
                            break;
                        case 5:
                            countFiv++;
                            break;
                        case 6:
                            countSix++;
                            break;
                        }

                    break;
                }

            }

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