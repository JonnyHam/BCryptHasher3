package com.example.BCryptHasher3;

import java.util.*;

public class RunnerMain {
    private String pass;
    private static String passType;
    public static void main (String[] args) throws Exception {


        if (args.length > 0) {
            //System.out.println("The command line arguments are: \n" + Arrays.toString(args));
            if (args.length == 2) {
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
                    System.out.println("Error with arguments");
                }
            } else {
                System.out.println("Needs 2 arguments");
            }
        } else {
            System.out.println("No command line arguments found.");

        }
    }
}
