package com.example.BCryptHasher3;

import java.security.NoSuchAlgorithmException;
import java.util.*;

public class BruteForce {
    private String type;
    private String hash;
    private ArrayList<Integer> plain;
    private String plainString;
    private boolean cracked;
    public BruteForce (String h, String t) {
        hash = h;
        type = t;
    }

    public String bruteForceAttack () throws NoSuchAlgorithmException {
        SHAMD5 test = new SHAMD5();

        cracked = false;
        plain = new ArrayList<>();
        plain.add((int)('a'));
        while (!cracked) {
            plainString = "";
            for (int i = 0; i < plain.size(); i++) {
                plainString += (char)((int)plain.get(i));
            }
            if (test.checkString(plainString, "MD5", hash) || test.checkString(plainString, "SHA-256", hash)) {
                cracked = true;
            } else {

            }
        }
        return "";
    }


}
