package com.example.BCryptHasher3;

import java.util.*;

public class RunnerMain {

    //main method
    public static void main (String[] args) throws Exception {

        //Checks to see if there are arguments
        if (args.length > 0) {

            //Lists arguments
            System.out.println("The command line arguments are: \n" + Arrays.toString(args));

            //Checks for correct number of arguments
            if (args.length == 2) {

                //Puts arguments in correct order for program
                if(args[0].length()>6){
                    String temp=args[0];
                    args[0]=args[1];
                    args[1]=temp;
                }

                long startTime = System.currentTimeMillis();

                //Checks argument and calls corresponding attack.
                if (args[0].equals("-dict")) {
                    Dictionary test = new Dictionary();

                    System.out.println(test.checkEnglish(args[1]));
                } else if (args[0].equals("-brute")) {
                    BruteForce2 test = new BruteForce2();
                    System.out.println(test.attack(args[1]));
                } else if (args[0].equals("-tenk")) {
                    PasswordChecker test = new PasswordChecker();
                    System.out.println(test.checkHash(args[1]));
                } else {

                    //Error messages bellow:
                    System.out.println("Error with arguments");
                }

                long elapsedTime = System.currentTimeMillis() - startTime;
                System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
            } else {
                System.out.println("Needs 2 arguments");
            }
        } else {
            System.out.println("No command line arguments found.");

        }
    }
}
