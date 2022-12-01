package com.example.BCryptHasher3;

import java.security.NoSuchAlgorithmException;
import java.util.*;

public class RunnerMain {
    private String pass;
    private static String passType;
    public static void main (String[] args) throws Exception {

        //Top 10K Passwords with SHA-256 and MD5


        /*
        PasswordChecker test = new PasswordChecker("Jonathan Kim");
        //MD5
        System.out.println(test.checkHash("df0349ce110b69f03b4def8012ae4970"));
        //SHA-256
        System.out.println(test.checkHash("82968e1da9cf580682e99ae94d78688d89684c0872e901c8b60cde135cd5369"));
         */

        /*
        BruteForce test = new BruteForce("df0349ce110b69f03b4def8012ae4970", "MD5");
        ArrayList<Integer> arrTest = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrTest.add(i+118);
        }
        test.bruteForceAttack();
        */


        //BruteForceAttack with MD5 or SHA-256


        //BruteForce2 test = new BruteForce2();

        //Plain text: "bat"
        //System.out.println(test.attack("5f3f4681121b460e3304a1887f42f1c3"));

        //Plain text: "mrwang"
        //System.out.println(test.attack("9145ad2b33c1c38967ddda4619d46f40"));

        //Plain text: "&!/"
        //System.out.println(test.attack("e76a383d183d17223550bb1c29189dcf"));

        //Plain text: "p@ss"
        //System.out.println(test.attack("195f19b835efe9f0b7b4e276ef1a8515"));


        //Top 10K Passwords with BCrypt


        //PasswordChecker test = new PasswordChecker("Jonathan Kim");
        //System.out.println(test.checkHash("$2a$13$dpCFxCbs7eZARWDvsvs.iuq3y9Jxz6iBbAngwZnoavCzVHtPOg//W"));

        //BCrypt test2 = new BCrypt("password", "$2a$13$dpCFxCbs7eZARWDvsvs.iuq3y9Jxz6iBbAngwZnoavCzVHtPOg//W");
        //System.out.println(test2.checkHash());


        //BruteForceAttack with BCrypt


        //BruteForce2 test = new BruteForce2();

        //Plain text: bat
        //System.out.println(test.attack("$2a$13$wBiwBCL0CaHU9o48Wc40ZOSUoZqYuQqiIXOvkTAyIOOA0QXtMK37y"));

        //Plain text: a
        //System.out.println(test.attack("$2a$13$I35NPBgZ.8.meKxaltJNPOqqbld1iGW977vn42n652nur7.bGahni"));


        //Dictionary Attack


        //Dictionary test = new Dictionary("Jonathan Kim");

        //Plain text: acne
        //System.out.println(test.checkEnglish("$2a$13$/PrEp5eK5ekr3/pyPRko7OIjuJnXrPQKljAEcpGj/Pk8jCTnc60su"));
        passType = "Dict";

        args = new String[3];
        args[0] = "4124bc0a9335c27f086f24ba207a4912";
        args[1] = "Brute";
        args[2] = "100117545";
        if (args.length > 0) {
            System.out.println("The command line arguments are: \n" + Arrays.toString(args));
            if (args.length == 3) {
                if (passType.equals("Dict")) {
                    Dictionary test = new Dictionary("" + args[2]);
                    System.out.println(test.checkEnglish("" + args[0]));
                } else if (args[1].equals("Brute")) {
                    BruteForce2 test = new BruteForce2();
                    System.out.println(test.attack(args[0]));
                }
            } else {
                System.out.println("Needs 2 argument");
            }
        } else {
            System.out.println("No command line arguments found.");

        }

    }
}
