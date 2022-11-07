package com.example.BCryptHasher3;

public class BcryptRunner3 {
    public static void main (String[] args) {
        String pTest = "monkey123";
        Bcrypt3 test = new Bcrypt3();
        test.inputPassword(pTest);
        test.hashPassword();
        System.out.println(test.getHashedPassword());
        System.out.println(test.checkHash());
    }
}
