package assignment1;

import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) throws Exception {
        // This file is just for tests, to help write the main stuff, formatting and
        // stuff doesn't matter
        // For generating a number from 1-6:
        /*
         * First do 1/2 to see if it'll be even or odd
         * Then in that half, generate 1/3 chance (assign a number to that like uhh 1
         * for odd) by adding (1/3)
         * If that 1/3 isn't reached, do a last 50/50 to determine
         */

        int countOne = 0;
        int countTwo = 0;
        int countThr = 0;
        int countFou = 0;
        int countFiv = 0;
        int countSix = 0;

        for (int i = 0; i < 100; i++) {

            int finalResult = 0;
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

            System.out.println(finalResult);
        }
        
        System.out.println(countOne + " " + countTwo + " " + countThr + " " + countFou + " " + countFiv + " " + countSix);
    }
}