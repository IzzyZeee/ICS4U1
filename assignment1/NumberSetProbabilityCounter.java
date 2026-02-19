package assignment1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberSetProbabilityCounter {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello fellow human! Enter your integers separated by a /.");

        ArrayList<Integer> set = new ArrayList();
        String list = keyboard.nextLine();

        StringTokenizer st = new StringTokenizer(list, "/");

        while (st.hasMoreElements()) {

            try {
                // int num = Integer.parseInt(st.nextToken());
                set.add(Integer.parseInt(st.nextToken()));
            } catch (Exception e) {
                System.out.println("Invalid input.");
                System.exit(0);
            }

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

        for (int j = 0; j < set.size(); j++) {
            if (item == set.get(j)) {
                count ++;
            }
        }

        System.out.println("The probability of getting a " + item + " in your set is " + count + "/" + set.size() + " or " + ((double)count / set.size()) + "%.");
        keyboard.close();

    }
}