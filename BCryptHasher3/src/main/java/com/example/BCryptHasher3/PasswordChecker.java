package com.example.BCryptHasher3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class PasswordChecker {
    public static void main (String[] args)  throws Exception {
        /*
        PasswordReader test = new PasswordReader();
        System.out.println(test.readPasswords());
        String passwords = test.readPasswords();
        String[] passwordList = passwords.split(" ");
        System.out.println(Arrays.toString(passwordList));
        System.out.println(passwordList[1000]);

        String[] passwordsHashed = new String[passwordList.length];

        SHAMD5 test2 = new SHAMD5();
        String hashedPasswords = "";
        for (int i = 0; i < passwordList.length; i++) {
            String hashedPassword;
            hashedPassword = test2.encryptString(passwordList[i], "SHA-256");
            passwordsHashed[i] = hashedPassword;
            hashedPasswords += hashedPassword + "\n";
        }
        //System.out.println(Arrays.toString(passwordsHashed));
        System.out.println(hashedPasswords);
         */
    }

    public PasswordChecker() throws Exception {
        /*
        PasswordReader test = new PasswordReader();
        //System.out.println(test.readPasswords());
        String passwords = test.readPasswords();
        String[] passwordList = passwords.split(" ");
        //System.out.println(Arrays.toString(passwordList));
        //System.out.println(passwordList[1000]);

        String[] passwordsHashed = new String[passwordList.length];

        SHAMD5 test2 = new SHAMD5();
        String hashedPasswords = "";
        for (int i = 0; i < passwordList.length; i++) {
            String hashedPassword;
            hashedPassword = test2.encryptString(passwordList[i], "SHA-256");
            passwordsHashed[i] = hashedPassword;
            hashedPasswords += hashedPassword + "\n";
        }
        //System.out.println(Arrays.toString(passwordsHashed));
        System.out.println(hashedPasswords);
         */
    }

    public String checkHash (String hash) throws Exception {
        File file = new File(
                "C:\\Users\\100117545\\Downloads\\BCryptHasher3\\BCryptHasher3\\src\\main\\java\\com\\example\\BCryptHasher3\\10KMD5.txt");

        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)

        // Creating an object of BufferedReader class
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        // Condition holds true till
        // there is character in a string
        while ((st = br.readLine()) != null)

            // Print the string
            System.out.println(st);
    }

}
