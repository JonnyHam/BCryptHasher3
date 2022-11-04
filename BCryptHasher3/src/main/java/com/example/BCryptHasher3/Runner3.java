package com.example.BCryptHasher3;

public class Runner3 {
    public static void main (String[] args) {
        String pTest = "monkey123";
        Bcrypt3 test = new Bcrypt3(pTest);
        System.out.println(test.hasher());
    }
}
