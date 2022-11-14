package com.example.BCryptHasher3;

import java.security.NoSuchAlgorithmException;

public class BruteForce {
    private String type;
    private String hash;
    private String plain;
    private boolean cracked;
    public BruteForce (String h, String t) {
        hash = h;
        type = t;
    }

    public String bruteForceAttack () throws NoSuchAlgorithmException {
        SHAMD5 test = new SHAMD5();

        cracked = false;
        plain = "a";
        while (!cracked) {
            if (test.checkString(plain, "MD5", hash) || test.checkString(plain, "SHA-256", hash)) {

            }
        }
        return "";
    }
}
