package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberSetProbabilityCounter {
    public static void main(String[] args) throws Exception {
        // Allows user to input an array of integers, and obtain the fraction +
        // percentage probability of a certain integer being selected from it
        // ex. [1, 2, 3, 3, 4, 5, 6, 67, 67, 67] and 67 would be 3/10 (3.3333%)
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello fellow human! Enter your integers, and type an uppercase X when you're done:");
        System.out.println();

        ArrayList<Integer> set = new ArrayList();

        while (true) {
            int number = 0;

            if (keyboard.nextLine() == "X") {
                break;
            }

            try { // In case a non-integer value is entered (or other error)
                number = Integer.parseInt(keyboard.nextLine());
            } catch (Exception e) { // Error instantly quits so DON'T mess up lol
                System.out.println("Invalid input, must be an integer.");
                System.exit(0);
            }

            System.out.println();
            set.add(number);
        }

        if (set.size() < 1) { // Can't have empty array, automatically quits
            System.out.println("You cannot have an empty set!");
            System.exit(0);
        }

        System.out.println("The probability of selecting which item in your set do you want to know?");
        System.out.println();

        int item = 0;
        int count = 0;

        try { // In case a non-integer value is entered (or other error)
                item = Integer.parseInt(keyboard.nextLine());
            } catch (Exception e) { // Error instantly quits so DON'T mess up lol
                System.out.println("Invalid input, must be an integer.");
                System.exit(0);
            }

        for (int i = 0; i < set.size(); i++) {
            if (item == set.get(i)) {
                count ++;
            }
        }

        System.out.println("The probability of getting a " + item + " in your set is " + count + "/" + set.size() + " or " + (count / set.size()) + "%.");
        keyboard.close();

    }
}