package com.example.BCryptHasher3;
import java.util.*;

public class PasswordChecker {
    public static void main (String[] args)  throws Exception {
        PasswordReader test = new PasswordReader();
        System.out.println(test.readPasswords());
        String passwords = test.readPasswords();
        String[] passwordList = passwords.split(" ");
        System.out.println(Arrays.toString(passwordList));
        System.out.println(passwordList[1000]);

        String[] passwordsHashed = new String[passwordList.length];

        MD5 test2 = new MD5();
        String hashedPasswords = "";
        for (int i = 0; i < passwordList.length; i++) {
            String hashedPassword;
            hashedPassword = test2.encryptString(passwordList[i], "MD5");
            passwordsHashed[i] = hashedPassword;
            hashedPasswords += hashedPassword + "\n";
        }
        //System.out.println(Arrays.toString(passwordsHashed));
        System.out.println(hashedPasswords);
    }


}
