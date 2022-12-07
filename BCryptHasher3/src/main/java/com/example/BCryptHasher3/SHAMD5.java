package com.example.BCryptHasher3;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class SHAMD5 {

    //This method encrypts plaintext into either SHA-256 or MD5 hash (depending on type)
    public String encryptString (String input, String type) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(type);
        byte[] messageDigest = md.digest(input.getBytes());
        BigInteger bigInt = new BigInteger(1, messageDigest);
        return bigInt.toString(16);
    }

    //This method checks to see whether a plaintext and hash is the same.
    public boolean checkString (String password, String type, String hashedPassword) throws NoSuchAlgorithmException {
        return hashedPassword.equals(this.encryptString(password, type));
    }
}
