package com.example.BCryptHasher3;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5 {
    public String encryptString (String input, String type) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(type);
        byte[] messageDigest = md.digest(input.getBytes());
        BigInteger bigInt = new BigInteger(1, messageDigest);
        return bigInt.toString(16);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MD5 encryptor = new MD5();

        String password = "monkey123";
        String type = "MD5";

        System.out.println(encryptor.encryptString(password, type));
    }
}
