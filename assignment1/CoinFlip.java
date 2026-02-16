package assignment1;

import java.util.ArrayList;
import java.util.Scanner;


public class CoinFlip {

    public static ArrayList<Integer> flip(int number) {
        
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            result.add((int) (Math.random() + 1)); // Math.random gives you a decimal from 0-1, which when you add 1, has a 50% chance of truncating to 0 or 1
        }

        return result;
        
    }   

public static void main(String[] args) throws Exception {
        // Simple coin flip simulation - will flip a coin(s) that will land either Heads or Tails.
        // You can choose how many coins to flip at once, and the results will be returned in an array (0 for heads, 1 for tails)
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hey there! How many coins do you want to flip? (Integer):");
        ArrayList<Integer> result = flip(keyboard.nextInt());
    
        System.out.println();
        System.out.println("Your results are:");
        System.out.println();

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    
    }
}