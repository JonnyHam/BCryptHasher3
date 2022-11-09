package com.example.BCryptHasher3;

import java.security.NoSuchAlgorithmException;

public class RunnerMain {
    public static void main (String[] args) throws NoSuchAlgorithmException {
        MD5 encryptor = new MD5();

        String password = "matthew";
        //type: can do MD5, SHA-256, and BCrypt
        String type = "BCrypt";
        if (!(type.equals("BCrypt"))) {
            String hashedPassword = encryptor.encryptString(password, type);
            System.out.println(hashedPassword);
            System.out.println(encryptor.checkString(password, type, hashedPassword));
        } else {
            Bcrypt3 test = new Bcrypt3();
            test.inputPassword(password);
            test.hashPassword();
            System.out.println(test.getHashedPassword());
            System.out.println(test.checkHash());
        }
        /*
        String pTest = "monkey123";
        Bcrypt3 test = new Bcrypt3();
        test.inputPassword(pTest);
        test.hashPassword();
        System.out.println(test.getHashedPassword());
        System.out.println(test.checkHash());
         */
    }
}
